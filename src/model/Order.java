package model;


public class Order {
  int oid;//订单id
  String buyId;//买家id
  String sellId;//卖家id;
  int pid;//产品id
  String time;
  public Order() {
	  
  }
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public String getBuyId() {
	return buyId;
}
public void setBuyId(String buyId) {
	this.buyId = buyId;
}
public String getSellId() {
	return sellId;
}
public void setSellId(String sellId) {
	this.sellId = sellId;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
	
   
	
}
