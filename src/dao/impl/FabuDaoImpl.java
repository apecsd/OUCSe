package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.FabuDao;
import model.Fabu;
import model.Type;
import util.db.DatabaseUtil;

public class FabuDaoImpl implements FabuDao {

	@Override
	public ArrayList<Fabu> findAll() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ArrayList<Fabu> arrayList = new ArrayList<Fabu>();
		String sql = "select * from fabu";
		conn = DatabaseUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Fabu fabu = new Fabu();
				fabu.setFid(rs.getInt(1));
				fabu.setSum(rs.getInt(2));
				fabu.setSellOrPur(rs.getInt(3));
				fabu.setTid(rs.getInt(4));
				fabu.setPid(rs.getInt(5));
				fabu.setSid(rs.getString(6));
				arrayList.add(fabu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arrayList;
	}

	@Override
	public ArrayList<Fabu> findBysid(String sid) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ArrayList<Fabu> arrayList = new ArrayList<Fabu>();
		String sql = "select * from fabu where sid=?";
		conn = DatabaseUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Fabu fabu = new Fabu();
				fabu.setFid(rs.getInt(1));
				fabu.setSum(rs.getInt(2));
				fabu.setSellOrPur(rs.getInt(3));
				fabu.setTid(rs.getInt(4));
				fabu.setPid(rs.getInt(5));
				fabu.setSid(rs.getString(6));
				arrayList.add(fabu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arrayList;
	}

	@Override
	public int addFabu(Fabu fabu) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		int result=0;
		String sql = "insert into fabu(sum,sellOrPur,tid,pid,sid) values(?,?,?,?,?)";
		conn = DatabaseUtil.getConnection();
		try{
			ps=conn.prepareStatement(sql);
			ps.setInt(1, fabu.getSum());
			ps.setInt(2, fabu.getSellOrPur());
			ps.setInt(3, fabu.getTid());
			ps.setInt(4, fabu.getPid());
			ps.setString(5, fabu.getSid());
			result = ps.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 return result;
	}
	@Override
     public ArrayList<Integer> findpidBysid(String sid) throws SQLException{
    	 Connection conn = null;
 		PreparedStatement ps = null;
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
 		String sql = "select pid from fabu where sid=?";
 		conn = DatabaseUtil.getConnection();
 		try {
 			ps = conn.prepareStatement(sql);
 			ps.setString(1, sid);
 			ResultSet rs = ps.executeQuery();
 			
 			while(rs.next()){
 				arrayList.add(rs.getInt(1));
 			}
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
 		return arrayList;
     }
}
