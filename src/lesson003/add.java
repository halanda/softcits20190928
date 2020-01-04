package lesson003;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		// 入力一个整数，打印从1至该数的所有数相加的和

		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		
		System.out.println(add(X));
	}
		
	public static int add(int X){	
		int answer = 0;
		for(int i=1;i<=X;i++) {
		answer = answer+i;
	    
		}
		return answer;
	}
}
		


