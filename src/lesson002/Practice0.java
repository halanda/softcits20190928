package lesson002;

import java.util.Scanner;

public class Practice0 {

	public static void main(String[] args) {
     	/**
		 *  a + b * c
		 *  
		 *  ��һ��: ��������calculate ��ֵa,b,c
		 *  �ڶ�����calculate���ú���multiple�����õ�b*c��ֵ
		 *  ��������calculate���ú���add����a+b*c
		 *  ���Ĳ���calculate��������ظ�main����
		 *  ���岽: main�����������ӡ
		 * 
		 *  ��ע�����:  +	-	*	/ %
		 */
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int answer = calculate(a,b,c);
		
		System.out.println(answer);
		
	}

	public static int calculate(int a,int b,int c) {
		int m = multiple(b,c);
		int resule = add(a,m);
		return resule;
	}
	
	public static int multiple(int a,int b) {
		
		return a*b;
	}
	
	public static int add(int a,int b) {
		
		return a+b;
	}
	
}
