package model;


public class Order {
  int oid;//����id
  String buyId;//���id
  String sellId;//����id;
  int pid;//��Ʒid
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
