package com.softcits.liu.view;

import java.util.Scanner;

import com.softcits.liu.dao.UserDao;
import com.softcits.liu.entity.User;



public class view {

	public static void main(String[] args) {
		User user = new User();
		// TODO Auto-generated method stub
        System.out.println("»¶Ó­Äú");
		System.out.println("ÇëÑ¡Ôñ£º1µÇÂ¼ 2×¢²á 3...");
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		if (input == 1) {
			System.out.println("ÇëÊäÈëÕËºÅ");
//			String n = sc.next();
			user.setUsername(sc.next());
			System.out.println("ÇëÊäÈëÃÜÂë");
//			String p = sc.next();
			user.setUserPassword(sc.next());
//			·â×°ÊôĞÔ
			
//			user.setUsername(n);
//			user.setUserPassword(p);
//			
			UserDao userdao = new UserDao();
			if (userdao.login(user)) {
				System.out.println("»¶Ó­Ê¹ÓÃ£¬µÇÂ¼³É¹¦");
			}else {
				System.out.println("ÓÃ»§Ãû»òÃÜÂë´íÎó");
				
			}
			
		}if(input == 2) {
			
		}
	}

}
