package model;

public class Classify {

	private int cid;
	private String classifyName;
	private int ClassifySort;
	
	public Classify()
	{
		
	}
	public Classify(int cid,String classifyName,int ClassyfySort) {
		this.cid = cid;
		this.classifyName = classifyName;
		this.ClassifySort = ClassyfySort;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getClassifyName() {
		return classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	public int getClassifySort() {
		return ClassifySort;
	}

	public void setClassifySort(int classifySort) {
		ClassifySort = classifySort;
	}

	@Override
	public String toString() {
		return "Classify [cid=" + cid + ", classifyName=" + classifyName + ", ClassifySort=" + ClassifySort + "]";
	}
	
	
	
	
	
	
	
}
