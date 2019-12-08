package model;


public class Product {
	private String pID;//产品id

	private String issueName;
	private String sID;
	private String pictureSRC;
	private float price;
	private int cid;   //分类id
	private String introduction;
	public Product(){
		
	}
	public Product(String pID,String issuename,String sID,String  pictureSRC,float price,int cid,String introduction) {
		this.pID =pID;
		this.issueName = issuename;
		this.sID = sID;
		this.pictureSRC = pictureSRC;
		this.price = price;
		this.cid = cid;
		this.introduction = introduction;
	}
	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}
	public String getPictureSRC() {
		return pictureSRC;
	}
	public void setPictureSRC(String pictureSRC) {
		this.pictureSRC = pictureSRC;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getpID() {
		return pID;
	}
	public void setpID(String pID) {
		this.pID = pID;
	}
	public String getsID() {
		return sID;
	}
	public void setsID(String sID) {
		this.sID = sID;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
}
