package lesson002;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

 /*
  * 目的：a/b+c
  */
//     第一步：键盘入力
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
//	第四步：调用函数calculate，并打印结果
	int answer = calculate(a,b,c);
	System.out.println(answer);
		

	}
//   第三步：calculate函数调用divide和add函数，并将结果返回给main函数
	public static int calculate(int a,int b,int c) {
		int m = divide(a,b);
		int result = add(m,c);
		return result;
	}
	
//	第一步：divide函数进行a/b，并将结果返回calculate函数
	public static int divide(int a,int b) {
		return a/b;
	}
//	第二步：add函数进行a+b，并将结果返回calculate函数
	public static int add(int a,int b) {
		return a+b;
	}
	
	
	
}
