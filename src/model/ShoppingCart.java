package model;

import java.util.ArrayList;

public class ShoppingCart {
int sid;
ArrayList< Product> products;
	
	public ShoppingCart() {
		ArrayList< Product> products = new ArrayList<Product>();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
}
