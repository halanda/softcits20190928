package lesson03;

import java.util.Scanner;

public class Integeradd {

	public static void main(String[] args) {
		// �������
		Scanner scan = new Scanner(System.in);
	    int a=scan.nextInt();
		
	    //��ӡ ��1���������ܺ�
		int i,sum;
		sum = 0;
		for(i=1;i<=a;i++) {
			
			sum+=i;
		
		}

		System.out.println(sum);
	}

}
