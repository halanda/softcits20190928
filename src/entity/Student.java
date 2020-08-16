package entity;

public class Student {

	private  int stuNo ;
	private String name;
	private double stuHeight;
	private int stuAge;
	
//	求两个整数和
	public int add(int a,int b) {
		int sum;
		return sum = a + b;
		
	}
	
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getStuHeight() {
		return stuHeight;
	}
	public void setStuHeight(double stuHeight) {
		this.stuHeight = stuHeight;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public Student(int stuNo, String name, double stuHeight, int stuAge) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.stuHeight = stuHeight;
		this.stuAge = stuAge;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + ", stuHeight=" + stuHeight + ", stuAge=" + stuAge + "]";
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("huanhuan");
		System.out.println(student.getName());
//        System.out.println(student.add(1, 1));
		int a;
		int b;
		student.add(a=1,b=1);
		System.out.println(student.add(a, b));
		
        
       
	}
	
}
