package lesson03;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// ����һ����������ӡ ��1���������ܺ�
		
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
	
		System.out.println(add(d));
	}
		 
    public static int add(int d){
    	
    	
    	//��ӡ ��1���������ܺ�
			int result=0;
			for(int i=1;i<=d;i++) {
				
				result = result + i;
			
			}

			return result;
    	 
    	 
    }
			    
	
}
	
