package JDBC_Task;

public class Student {

	private int stuno;
	private String stuname;
	private String stuphone;
	private String stubirthday;
	private double stuheight;
	private int classid;
	private String createtime;
	private String updatetime;
	
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStuphone() {
		return stuphone;
	}
	public void setStuphone(String stuphone) {
		this.stuphone = stuphone;
	}
	public String getStubirthday() {
		return stubirthday;
	}
	public void setStubirthday(String stubirthday) {
		this.stubirthday = stubirthday;
	}
	public double getStuheight() {
		return stuheight;
	}
	public void setStuheight(double stuheight) {
		this.stuheight = stuheight;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	
	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", stuname=" + stuname + ", stuphone=" + stuphone + ", stubirthday="
				+ stubirthday + ", stuheight=" + stuheight + ", classid=" + classid + ", createtime=" + createtime
				+ ", updatetime=" + updatetime + "]";
	}
	
	
	
	
}
