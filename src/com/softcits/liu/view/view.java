package com.softcits.liu.view;

import java.util.Scanner;

import com.softcits.liu.entity.User;



public class view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("��ӭ��");
		System.out.println("��ѡ��1��¼ 2ע�� 3...");
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		if (input == 1) {
			System.out.println("�������˺�");
			String n = sc.next();
			System.out.println("����������");
			String p = sc.next();
//			��װ����
			User user = new User();
			user.setUsername(n);
			user.setUserPassword(p);
			
			
		}if(input == 2) {
			
		}
	}

}
