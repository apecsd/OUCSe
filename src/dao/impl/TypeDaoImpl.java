package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.TypeDao;
import model.Type;
import util.db.DatabaseUtil;

public class TypeDaoImpl implements TypeDao {

	@Override
	public Type findById(int tid) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		Type type = new Type();
		String sql = "select * from type where tid=?";
		conn = DatabaseUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, tid);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				type.setTid(tid);
				type.settName(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return type;
	}

	@Override
	public ArrayList<Type> findAllType() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ArrayList<Type> arrayList = new ArrayList<Type>();
		String sql = "select * from type";
		conn = DatabaseUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Type type =new Type();
				type.setTid(rs.getInt(1));
				type.settName(rs.getString(2));
				arrayList.add(type);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arrayList;
	}

}
