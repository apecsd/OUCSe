package dao.impl;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import model.Product;

public class ProductDaoImplTest {
    
	@Test
	public void testFindAllProduct() throws SQLException {
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		ArrayList<Product> arrayList = new ArrayList<Product>();
		arrayList = productDaoImpl.findAllProduct();
		for(Product product:arrayList) {
			System.out.println(product);
		}
	}

	@Test
	public void testFindProductByTid() throws SQLException {
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		ArrayList<Product> arrayList = new ArrayList<Product>();
		arrayList = productDaoImpl.findProductByTid(1);
		for(Product product:arrayList) {
			System.out.println(product);
		}
	}

	@Test
	public void testFindProductBySid() throws SQLException {
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		ArrayList<Product> arrayList = new ArrayList<Product>();
		arrayList = productDaoImpl.findProductBySid("17020031108");
		for(Product product:arrayList) {
			System.out.println(product);
		}
	}

	@Test
	public void testAddProduct() throws SQLException {
		int result = -1;
		ProductDaoImpl productDaoImpl = new ProductDaoImpl();
		Product product = new Product();
		product.setIssueName("ipad");
		product.setTid(2);
		product.setIntroduction("平板买了没怎么用，低价");
		product.setPrice((float) 1000);
		product.setSid("17020031110");
		product.setPictureSRC("D:\\软件工程\\picture\\9.jpg");
		result = productDaoImpl.addProduct(product);
		System.out.println(result);
	}

	@Test
	public void testDeleteProduct() {
		fail("Not yet implemented");
	}

}
