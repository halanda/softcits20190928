package lesson03;

import java.util.Scanner;

public class practice1 {
	
	   // ���� 5
       //	�������
       //	
       //    *
       //   **
       //  ***
       // ****
       //*****

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int x=scan.nextInt();
	    
	   // ѭ����ӡ��
	    for(int j=1;j<=x;j++) {
	    
	    //����ո�
	    for(int i=1;i<=x-j;i++){
	    	
	    	System.out.print(" ");
	    }
	    //����*	
	    	for(int m=1;m<=j;m++) {
	    		
	    System.out.print("*");
	    	}
	    	
	    	//��ӡ�س�
	    	 System.out.println();
	    }
        
	}

}
