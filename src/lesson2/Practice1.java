package lesson2;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*Ŀ�ģ�a/b+c
		 * ��һ������������calculate��ֵa,b,c
		 * �ڶ�����calculate���ú���divide�����õ�a/b��ֵ
		 * ��������calculate���ú���add���õ�a/b+c��ֵ
		 * ���Ĳ���calculate��������ظ�main����
		 *���岽��main�����������ӡ
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
