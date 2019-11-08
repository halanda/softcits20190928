package lesson03;

import java.util.Scanner;

public class practice1 {
	
	   // 输入 5
       //	输出如下
       //	
       //    *
       //   **
       //  ***
       // ****
       //*****

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int x=scan.nextInt();
	    
	   // 循环打印行
	    for(int j=1;j<=x;j++) {
	    
	    //处理空格
	    for(int i=1;i<=x-j;i++){
	    	
	    	System.out.print(" ");
	    }
	    //处理*	
	    	for(int m=1;m<=j;m++) {
	    		
	    System.out.print("*");
	    	}
	    	
	    	//打印回车
	    	 System.out.println();
	    }
        
	}

}
