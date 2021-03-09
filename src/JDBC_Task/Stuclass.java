package JDBC_Task;

public class Stuclass {

	private int classid;
	private String classname;
	private String classloc;
	private String classmemo;
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getClassloc() {
		return classloc;
	}
	public void setClassloc(String classloc) {
		this.classloc = classloc;
	}
	public String getClassmemo() {
		return classmemo;
	}
	public void setClassmemo(String classmemo) {
		this.classmemo = classmemo;
	}
	@Override
	public String toString() {
		return "Stuclass [classid=" + classid + ", classname=" + classname + ", classloc=" + classloc + ", classmemo="
				+ classmemo + "]";
	}
	
	
	
	
}
