package com.softcits.liu.view;

import java.util.Scanner;

import com.softcits.liu.dao.UserDao;
import com.softcits.liu.entity.User;



public class view {

	public static void main(String[] args) {
		User user = new User();
		// TODO Auto-generated method stub
        System.out.println("��ӭ��");
		System.out.println("��ѡ��1��¼ 2ע�� 3...");
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		if (input == 1) {
			System.out.println("�������˺�");
//			String n = sc.next();
			user.setUsername(sc.next());
			System.out.println("����������");
//			String p = sc.next();
			user.setUserPassword(sc.next());
//			��װ����
			
//			user.setUsername(n);
//			user.setUserPassword(p);
//			
			UserDao userdao = new UserDao();
			if (userdao.login(user)) {
				System.out.println("��ӭʹ�ã���¼�ɹ�");
			}else {
				System.out.println("�û������������");
				
			}
			
		}if(input == 2) {
			
		}
	}

}
