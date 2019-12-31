package model;


public class Product {
	private int pid;//产品id
	private String issueName;//产品名称
	private String sid;//用户id
	private String pictureSRC;
	private float price;
	private int tid;   //分类id
	private String introduction;
	private int currentNum;//库存
	private String fabuTime;//发布时间
	public Product(){
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getIssueName() {
		return issueName;
	}
	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
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
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getCurrentNum() {
		return currentNum;
	}
	public void setCurrentNum(int currentNum) {
		this.currentNum = currentNum;
	}
	public String getFabuTime() {
		return fabuTime;
	}
	public void setFabuTime(String fabuTime) {
		this.fabuTime = fabuTime;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", issueName=" + issueName + ", sid=" + sid + ", pictureSRC=" + pictureSRC
				+ ", price=" + price + ", tid=" + tid + ", introduction=" + introduction + ", currentNum=" + currentNum
				+ ", fabuTime=" + fabuTime + "]";
	}
	
	
	
	
}
