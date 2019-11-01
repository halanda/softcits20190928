package lesson03;

import java.util.Scanner;

public class Fx {
	
	
	public static int f(int x) {
		
		if (x == 0) {
			return 1;
		}
		else if (x==1) {
			return 2;
		}
		else {
			return f(x-1)+f(x-2);
		}
	}

	public static void main(String[] args) {
		
		// X的值为键盘输入
		Scanner scan = new Scanner (System.in);
		
		int x=scan.nextInt();
	
		System.out.println(f(x));
		
	}
	
}
