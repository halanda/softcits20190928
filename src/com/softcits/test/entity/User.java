package com.softcits.test.entity;

import sun.applet.Main;

public class User {

	private String id;//员工编号
	private String name;//员工姓名
	private String password;//密码
//	private int age;
    private int role;//权限
    private String address;//地址
    private String phone;//电话
    
//    set get方法生成

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	有参构造方法
	public User(String id, String name, String password, int role, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
		this.address = address;
		this.phone = phone;
	}
	
//	无参构造方法
	public User() {
		super();
	}
	
//toString	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + ", address="
				+ address + ", phone=" + phone + "]";
	}
	
	static User [] arr = new User[10];
	static {
		User u1 = new User("u1","admin","123",1,"大连","138");
	    User u2 = new User("u2","zhangsan","123",0,"沈阳","139");
	    User u3 = new User("u3","lisi","111",0,"鞍山","130");
	    arr[0] = u1;
	    arr[1] = u2;
	    arr[2] = u3;
	}
	
	// 登录方法login
	public boolean login(User u) {
		for (int i = 0; i < arr.length; i++) {
	
			if(arr[i]!=null&&arr[i].getName().equals(u.getName())&&arr[i].password.equals(u.getPassword())) {
				return true;
			}else {
				return false;
			}	
		}
		return false;
		}
		
	public static void main(String[] args) {
		System.out.println("1".equals("2"));
	}
}
