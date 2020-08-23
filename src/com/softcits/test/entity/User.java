package com.softcits.test.entity;

import sun.applet.Main;

public class User {

	public String id;
	public String name;
	public String password;
	public int age;

	// µÇÂ¼·½·¨login

	public boolean login(String name,String password) {
		
		if("admin".equals(name)&&"123".equals(password)) {
			return true;
		}else {
			return false;
		}	
	}
	public static void main(String[] args) {
		System.out.println("1".equals("2"));
	}
}
