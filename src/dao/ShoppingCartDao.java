package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.ShoppingCart;

public interface ShoppingCartDao {

	public ArrayList<ShoppingCart> findShoppingCartsBySid(String sid) throws SQLException;//根据用户ID查购物车
	
	public int addShoppingCart(ShoppingCart shoppingCart);
	
	public int delShoppingCart(ShoppingCart shoppingCart);
}
