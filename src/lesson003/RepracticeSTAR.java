package lesson003;

import java.util.Scanner;

public class RepracticeSTAR {

	public static void main(String[] args) {
		
//		��������
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
//		��ӡ����
		
		for(int i=1;i<=N;i++) {
			
//		��ӡ�ո�
			for(int s=N-i;s>=0;s--) {
				System.out.print(" ");
			}	
//		��ӡ����
		    for(int x=1;x<=i;x++) {
		    	System.out.print("*");
	    }	
//		��ӡ�س�
		    System.out.println();
		}

	}

}
