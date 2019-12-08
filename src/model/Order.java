package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Order {

	int oid;
	int sum;
	int sellOrPur;
	ArrayList<Product> products;
	public Order() {
		ArrayList<Product> products = new ArrayList<Product>();
		
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSellOrPur() {
		return sellOrPur;
	}
	public void setSellOrPur(int sellOrPur) {
		this.sellOrPur = sellOrPur;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
   
	
}
