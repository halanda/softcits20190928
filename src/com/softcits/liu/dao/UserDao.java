package com.softcits.liu.dao;

import java.util.Scanner;

import com.softcits.liu.entity.User;
import com.sun.org.apache.xpath.internal.FoundIndex;

public class UserDao {
	//定义一个存储User类型的数组
//	tepy2
	static User[] arr = new User[20];
	
	static {
//		tepy1
		User user1 = new User("u01", "admin", "123", "大连", "199");
		User user2 = new User("u02", "李四", "234", "沈阳", "139");
		User user3 = new User("u03", "赵五", "456", "锦州", "138");

		arr[0] = user1;
		arr[1] = user2;
		arr[2] = user3;
	}
	//通过名字查询，看是否存在
	public boolean checkUsername(String username) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=null && arr[i].getUsername().equals(username)) {
				return true;
			} 
			
		}
		return false;
		
	}
	
	
	//查询所有
	public User[] selectAll() {
		return arr;
	}
	public static void main(String[] args) {
		UserDao UserDao = new UserDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入名字：");
		boolean a = UserDao.checkUsername(sc.next());
		if (a) {
			System.out.println("存在");
		} else {
			
			//调用注册
			System.out.println("不存在");
		}
		
		

//		User[] arr = 	UserDao.selectAll();
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i]!=null) {
//				System.out.println(arr[i]);
//			}
//		}
		
		
		
	}
	
	//定义登陆方法
	public boolean login (User user) {
		for (int i = 0; i < arr.length; i++) {
     //	找出每个对象进行比对(数组和前台)
		if(arr[i]!=null&&arr[i].getUsername().equals(user.getUsername())&&arr[i].getUserPassword().equals(user.getUserPassword())) {
			return true;
		}
			
		}
		return false;

	}
	
	
	public User selectByName(User user) {
		for (int j= 0;  j< arr.length; j++) {
		 if(arr[j]!=null&&arr[j].getUsername().equals(user.getUsername())) {
			 return arr[j];
		 }
			
		}
		
		return null;
		
	}
}