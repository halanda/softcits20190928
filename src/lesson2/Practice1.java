package lesson2;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*目的：a/b+c
		 * 第一步：主函数向calculate传值a,b,c
		 * 第二步：calculate调用函数divide，并得到a/b的值
		 * 第三步：calculate调用函数add，得到a/b+c的值
		 * 第四步：calculate将结果返回给main函数
		 *第五步：main函数将结果打印
		 */
		
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int answer=calculate(a,b,c);
		System.out.println(answer);
	}

	public static int calculate(int a, int b, int c) {
		int d = divide(a,b);
		int result = add(d,c);
		return result;
	}
	
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}

}
