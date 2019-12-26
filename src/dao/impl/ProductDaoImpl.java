package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.ProductDao;
import model.Product;
import util.db.DatabaseUtil;


public class ProductDaoImpl implements ProductDao {

	@Override
	public ArrayList<Product> findAllProduct() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		ArrayList<Product> arrayList = new ArrayList<Product>();
		
		String sql = "select * from product";
		conn = DatabaseUtil.getConnection();
		try{
		ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Product product  = new Product();
			product.setPid(rs.getInt(1));
			product.setIssueName(rs.getString(2));
			product.setSid(rs.getString(3));
			product.setPictureSRC(rs.getString(4));
			product.setPrice(rs.getFloat(5));
			product.setTid(rs.getInt(6));
			product.setIntroduction(rs.getString(7));
			arrayList.add(product);
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}	

	@Override
	public ArrayList<Product> findProductByTid(int tid) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		ArrayList<Product> arrayList = new ArrayList<Product>();
		
		String sql = "select * from product where tid=?";
		conn = DatabaseUtil.getConnection();
		try{
		ps = conn.prepareStatement(sql);
		ps.setInt(1, tid);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Product product  = new Product();
			product.setPid(rs.getInt(1));
			product.setIssueName(rs.getString(2));
			product.setSid(rs.getString(3));
			product.setPictureSRC(rs.getString(4));
			product.setPrice(rs.getFloat(5));
			product.setTid(rs.getInt(6));
			product.setIntroduction(rs.getString(7));
			arrayList.add(product);
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}

	@Override
	public ArrayList<Product> findProductBySid(String sid) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		
		ArrayList<Product> arrayList = new ArrayList<Product>();
		
		String sql = "select * from product where sid=?";
		conn = DatabaseUtil.getConnection();
		try{
		ps = conn.prepareStatement(sql);
		ps.setString(1, sid);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Product product  = new Product();
			product.setPid(rs.getInt(1));
			product.setIssueName(rs.getString(2));
			product.setSid(rs.getString(3));
			product.setPictureSRC(rs.getString(4));
			product.setPrice(rs.getFloat(5));
			product.setTid(rs.getInt(6));
			product.setIntroduction(rs.getString(7));
			arrayList.add(product);
		}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}

	@Override
	public int addProduct(Product product) throws SQLException {
		 Connection conn = null;
			PreparedStatement ps = null;
			int result=0;
			String sql = "insert into product(issueName,sid,pictureSRC,price,tid,introduction) values(?,?,?,?,?,?)";
			conn = DatabaseUtil.getConnection();
			try{
				ps=conn.prepareStatement(sql);
				ps.setString(1, product.getIssueName());
				ps.setString(2, product.getSid());
				ps.setString(3, product.getPictureSRC());
				ps.setFloat(4, product.getPrice());
				ps.setInt(5, product.getTid());
				ps.setString(6, product.getIntroduction());
				result = ps.executeUpdate();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return result;
	}

	@Override
	public int deleteProduct(int pid) throws SQLException {
		 Connection conn = null;
			PreparedStatement ps = null;
			int result = -1;
			String sql = "delete from product where pid=?";
			conn = DatabaseUtil.getConnection();
			try{
				ps = conn.prepareStatement(sql);
				ps.setInt(1, pid);
				result = ps.executeUpdate();
				
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}

}
