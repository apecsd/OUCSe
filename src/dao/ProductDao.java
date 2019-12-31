package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Product;

public interface ProductDao {
   public ArrayList<Product> findAllProduct()throws SQLException;
   
   public ArrayList<Product> findProductByTid(int tid) throws SQLException;
   
   public ArrayList<Product> findProductBySid(String sid) throws SQLException;
   
   public int addProduct(Product product) throws  SQLException;
   
   public int deleteProduct(int pid) throws SQLException;
   
   public Product findProductByPid(int pid) throws SQLException;
}
