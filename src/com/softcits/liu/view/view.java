package com.softcits.liu.view;

import java.util.Scanner;

import com.softcits.liu.entity.User;



public class view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("»¶Ó­Äú");
		System.out.println("ÇëÑ¡Ôñ£º1µÇÂ¼ 2×¢²á 3...");
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		if (input == 1) {
			System.out.println("ÇëÊäÈëÕËºÅ");
			String n = sc.next();
			System.out.println("ÇëÊäÈëÃÜÂë");
			String p = sc.next();
//			·â×°ÊôĞÔ
			User user = new User();
			user.setUsername(n);
			user.setUserPassword(p);
			
			
		}if(input == 2) {
			
		}
	}

}
