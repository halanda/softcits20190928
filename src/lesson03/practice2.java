package lesson03;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// 输入一个整数，打印 从1至该数的总和
		
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
	
		System.out.println(add(d));
	}
		 
    public static int add(int d){
    	
    	
    	//打印 从1至该数的总和
			int result=0;
			for(int i=1;i<=d;i++) {
				
				result = result + i;
			
			}

			return result;
    	 
    	 
    }
			    
	
}
	
