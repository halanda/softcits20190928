package lesson11;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		/*
		 * // 税后工资=税前月薪-个人支付+补助 // 养�?�个�?8%，医疗个�?2%，公积金个人10% // 采暖补助
		 * 139/�?
		 */		
		
		Scanner scan = new Scanner(System.in);
		int salary =scan.nextInt();
		
		int a = (int) (salary*0.08);
		int b = (int) (salary*0.02);
		int c = (int) (salary*0.1);
		
		int answer = salary - a - b - c + 139;
		
		System.out.println(answer);
		

	}

}
