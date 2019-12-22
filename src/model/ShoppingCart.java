package model;


public class ShoppingCart {
String sid;//用户id
int cartId;//购物车id
int pid;//添加购物车的产品id
	
	public ShoppingCart() {
		
	}
	
	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	
	
}
