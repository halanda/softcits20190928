package com.softcits.test.entity;

import sun.applet.Main;

public class User {

	private String id;
	private String name;
	private String password;
	private int age;

//	set get����
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	�вι��췽��
	public User(String id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
//	�޲ι��췽��
	
	public User() {
		super();
	}
	
//	toString����
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	// ��¼����login
	public boolean login(User u) {
		
		if("admin".equals(u.getName())&&"123".equals(u.getPassword())) {
			return true;
		}else {
			return false;
		}	
	}
	public static void main(String[] args) {
		System.out.println("1".equals("2"));
	}
}
