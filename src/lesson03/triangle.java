package lesson03;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// ��������
		Scanner scan = new Scanner(System.in);
	    int a=scan.nextInt();

		for(int i=0;i<a;i++){
			//��ӡ�ո�
			for(int j=a-i;j>0;j--){
				
				System.out.print(" ");
			}
			//��ӡ*
			
			for(int j=1;j<=i+1;j++){
				
				System.out.print("*");
				
			}
			//��ӡ�س�
			System.out.println();
		}
		
	}

}
