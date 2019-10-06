package lesson2;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*Ä¿µÄ£ºa^2+(b%c-d)*e
		 * 
		 * 
		 */
		Scanner scan=new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		int e=scan.nextInt();
		
		int answer=calculate(a,b,c,d,e);
		System.out.println(answer);
	}

	public static int calculate(int a, int b, int c,int d,int e) {
		int f = multiple(a,a);
		int g=  mod(b,c);
		int h = sub(g,d);
		int i = multiple(h,e);
		int result = add(f,i);
		return result;
	}
	public static int multiple(int a, int b) {
		return a*b;
	}
	
	public static int mod(int a, int b) {
		return a%b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int multiple(int a, int b) {
		return a*b;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
}
