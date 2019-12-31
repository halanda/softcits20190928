package lesson002;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		 * 目的：a^2+(b%c-d)*e
		 * a=10
		 * b=10
		 * c=2
		 * d=3
		 * e=8
		 * 结果：76
		 */
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		
		int answer = calculate(a,b,c,d,e);
	    System.out.println(answer);
	}

	public static int calculate(int a,int b, int c,int d,int e) {
		int m = mod(b,c);
		int n = sub(m,d);
		int o = multiple(n,e);
		int p = multiple1(a);
		int result = add(p,o);
		return result; 
	}
	
	
	public static int mod(int a,int b) {
		return a%b;
	}
	
	public static int sub(int a,int b) {
		return a-b;
	}
	
	public static int multiple(int a,int b) {
		return a*b;
	}
	
	public static int multiple1(int a) {
		return a*a;
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	
}
