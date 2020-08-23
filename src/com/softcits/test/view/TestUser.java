package com.softcits.test.view;

import java.util.Scanner;

import com.softcits.test.entity.User;

public class TestUser {
	
	public static void main(String[] args) {
		System.out.println("欢迎来到Softcits系统");
		System.out.println("请输入您的名字:");
		Scanner sc = new Scanner(System.in);
		String na = sc.next();
		System.out.println("请输入password:");
		String pwd = sc.next();
		
		User u = new User();
		if(u.login(na, pwd)){
			System.out.println("登录成功"+"欢迎你，"+na);
		}else {
			System.out.println("登录失败");
		}
		
	}

}
