package lesson2;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*Ä¿µÄ£ºa^2+(b%c-d)*e
		 * 
		 * 
		 */
		Scanner scan = new Scanner (System.in);
		//3
		int a=scan.nextInt();
		//5
		int b=scan.nextInt();
		//3
		int c=scan.nextInt();
		//1
		int d=scan.nextInt();
		//5
		int e=scan.nextInt();
		
		int answer=calculate(a,b,c,d,e);
		System.out.println(answer);
	}

	public static int calculate(int a, int b, int c,int d,int e) {
		int f = multiple(a);
		int g=  mod(b,c);
		int h = sub(g,d);
		int i = multiple2(h,e);
		int result = add(f,i);
		return result;
	}
	public static int multiple(int a) {
		return a*a;
	}
	public static int mod(int a, int b) {
		return a%b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int multiple2(int a, int b) {
		return a*b;
	}
	
	
	public static int add(int a, int b) {
		return a+b;
	}
}
