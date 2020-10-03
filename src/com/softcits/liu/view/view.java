package com.softcits.liu.view;

import java.util.Scanner;

import com.softcits.liu.dao.UserDao;
import com.softcits.liu.entity.User;



public class view {

	public static void main(String[] args) {
		User user = new User();
	
        System.out.println("欢迎您");
		System.out.println("请选择：1登录 2注册 3...");
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		if (input == 1) {
			System.out.println("请输入账号");
//			String n = sc.next();
			user.setUsername(sc.next());
			System.out.println("请输入密码");
//			String p = sc.next();
			user.setUserPassword(sc.next());
//			封装属性
			
//			user.setUsername(n);
//			user.setUserPassword(p);
//			
			UserDao userdao = new UserDao();
			if (userdao.login(user)) {
				System.out.println("欢迎使用，登录成功");
				System.out.println("1.通过名字查数据 2.通过id查数据");
				input =sc.nextInt();
				if(input == 1) {
					System.out.println("请输入名字");
					user.setUsername(sc.next());
					userdao.selectByName(user);
					if(user!=null) {
					System.out.println(user.toString());	
					}
					
				}
				
			}else {
				System.out.println("用户名或密码错误");
				
			}
			
		}if(input == 2) {
			
		}
	}

}
