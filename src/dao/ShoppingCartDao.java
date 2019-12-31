package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.ShoppingCart;

public interface ShoppingCartDao {

	public ArrayList<ShoppingCart> findShoppingCartsBySid(String sid) throws SQLException;//�����û�ID�鹺�ﳵ
	
	public int addShoppingCart(ShoppingCart shoppingCart);
	
	public int delShoppingCart(ShoppingCart shoppingCart);
}
