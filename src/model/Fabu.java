package model;

public class Fabu {
	int fid;//发布id
	int sum;//数量
	int sellOrPur;//求购或求售
	int tid;//分类id
	int pid;//产品id
	String sid;//用户id
	public Fabu() {
		
		
	}
	
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
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
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Fabu [fid=" + fid + ", sum=" + sum + ", sellOrPur=" + sellOrPur + ", tid=" + tid + ", pid=" + pid
				+ ", sid=" + sid + "]";
	}

	
	
}
