package com.softcits.liu.dao;

import com.softcits.liu.entity.User;

public class UserDao {
	//����һ���洢User���͵�����
//	tepy2
	static User[] arr = new User[20];
	
	static {
//		tepy1
		User user1 = new User("u01", "admin", "123", "����", "199");
		User user2 = new User("u02", "����", "234", "����", "139");
		User user3 = new User("u03", "����", "456", "����", "138");

		arr[0] = user1;
		arr[1] = user2;
		arr[2] = user3;
	}
	//�����½����
	public boolean login (User user) {
		for (int i = 0; i < arr.length; i++) {
     //	�ҳ�ÿ��������бȶ�(�����ǰ̨)
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