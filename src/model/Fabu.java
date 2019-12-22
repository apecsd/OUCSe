package model;

public class Fabu {
	int oid;//订单id
	int sum;//数量
	int sellOrPur;//求购或求售
	int tid;//分类id
	int pid;//产品id
	public Fabu() {
		
		
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
}
