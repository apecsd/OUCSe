package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.ShoppingCartDao;
import model.Product;
import model.ShoppingCart;
import util.db.DatabaseUtil;

public class ShoppingCartDaoImpl implements ShoppingCartDao {

	@Override
	public ArrayList<ShoppingCart> findShoppingCartsBySid(String sid){
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		
		ArrayList<ShoppingCart> arrayList = new ArrayList<ShoppingCart>();
		String sql = "select * from shoppingcart where sid=?";
		conn = DatabaseUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ShoppingCart shoppingCart = new ShoppingCart();
				shoppingCart.setSid(rs.getString(1));
				shoppingCart.setCartId(rs.getInt(2));
				shoppingCart.setPid(rs.getInt(3));
				shoppingCart.setNum(rs.getInt(4));
				shoppingCart.setIssueName(rs.getString(5));
				shoppingCart.setPrice(rs.getFloat(6));
				shoppingCart.setTotalPrice(rs.getFloat(7));
				shoppingCart.setIntroduction(rs.getString(8));
				arrayList.add(shoppingCart);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arrayList;
	}

	@Override
	public int addShoppingCart(ShoppingCart shoppingCart) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result=0;
		String sql = "insert into shoppingcart(sid,cartId,pid,num,issueName,price,totalPrice,introduction) values(?,?,?,?,?,?,?,?)";
		conn = DatabaseUtil.getConnection();
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, shoppingCart.getSid());
			ps.setInt(2, shoppingCart.getCartId());
			ps.setInt(3, shoppingCart.getPid());
			ps.setInt(4, shoppingCart.getNum());
			ps.setString(5, shoppingCart.getIssueName());
			ps.setFloat(6, shoppingCart.getPrice());
			ps.setFloat(7, shoppingCart.getTotalPrice());
			ps.setString(8, shoppingCart.getIntroduction());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int delShoppingCart(ShoppingCart shoppingCart) {

		Connection conn = null;
		PreparedStatement ps = null;
		int result = -1;
		String sql = "delete from shoppingcart where cartId=?";
		conn = DatabaseUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, shoppingCart.getCartId());
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}

}
