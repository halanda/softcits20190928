package lesson03;

import java.util.Scanner;

public class Integerpower {

	public static void main(String[] args) {
		
		  //  ‰»Îº¸≈Ã
	
       Scanner scan = new Scanner(System.in);
    
       long a=scan.nextLong();
       long power=scan.nextLong();
       
	    long result=1L;
	    
	    for(long i=0;i<power;i++) {
	    	
	    	result = result*a;
	    }
	    System.out.println(result);
	}

	

}
