package lesson002;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

 /*
  * Ŀ�ģ�a/b+c
  */
//     ��һ������������
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
//	���Ĳ������ú���calculate������ӡ���
	int answer = calculate(a,b,c);
	System.out.println(answer);
		

	}
//   ��������calculate��������divide��add����������������ظ�main����
	public static int calculate(int a,int b,int c) {
		int m = divide(a,b);
		int result = add(m,c);
		return result;
	}
	
//	��һ����divide��������a/b�������������calculate����
	public static int divide(int a,int b) {
		return a/b;
	}
//	�ڶ�����add��������a+b�������������calculate����
	public static int add(int a,int b) {
		return a+b;
	}
	
	
	
}
