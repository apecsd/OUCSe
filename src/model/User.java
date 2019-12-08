package model;

public class User {

	private String sID;
	private String userName; 
	private String sex;
	private String phoneNum;
	private String password;
	private int sellNum;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getsID() {
		return sID;
	}
	public void setsID(String sID) {
		this.sID = sID;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getSellNum() {
		return sellNum;
	}
	public void setSellNum(int sellNum) {
		this.sellNum = sellNum;
	}
		
}