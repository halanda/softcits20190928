package com.softcits.test.view;

import java.util.Scanner;

import com.softcits.test.entity.User;

public class TestUser {
	
	public static void main(String[] args) {
		System.out.println("��ӭ����Softcitsϵͳ");
		System.out.println("��������������:");
		Scanner sc = new Scanner(System.in);
		String na = sc.next();
		System.out.println("������password:");
		String pwd = sc.next();
		
		User u = new User();
		if(u.login(na, pwd)){
			System.out.println("��¼�ɹ�"+"��ӭ�㣬"+na);
		}else {
			System.out.println("��¼ʧ��");
		}
		
	}

}
