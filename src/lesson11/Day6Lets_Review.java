package lesson11;
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Day6Lets_Review {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    	Scanner scan = new Scanner(System.in);
	        int T = scan.nextInt();
	        String string[] = new String[T];
	        for(int i = 0; i<T; i++){
	            string[i] = scan.next();
	        }
	        for(int temp = 0; temp<T; temp++){

	            for(int j = 0; j<string[temp].length(); j = j+2)
	            {
	                System.out.print(string[temp].charAt(j));
	            }
	            System.out.print(" ");

	            for(int j = 1; j<string[temp].length(); j = j+2){
	                System.out.print(string[temp].charAt(j));
	            }

	            System.out.println();

	        }
	        scan.close();
	    
	    
	    
	    
	    }
	}
