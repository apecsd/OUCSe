package model;


public class ShoppingCart {
String sid;//用户id
int cartId;//购物车id
int pid;//添加购物车的产品id
int num;//这个产品在购物车里的数量
String issueName;//这个购物车的产品名字
float price;//这个商品的单价
float totalPrice;//商品总价
String introduction;


	@Override
public String toString() {
	return "ShoppingCart [sid=" + sid + ", cartId=" + cartId + ", pid=" + pid + ", num=" + num + ", issueName="
			+ issueName + ", price=" + price + ", totalPrice=" + totalPrice + "]";
}



	public String getIntroduction() {
		return introduction;
	}



	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}



	public String getIssueName() {
	return issueName;
}


	
public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public float getTotalPrice() {
		return totalPrice;
	}



	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}



public void setIssueName(String issueName) {
	this.issueName = issueName;
}

	public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

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
