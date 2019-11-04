package lesson4;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*; 
import java.util.regex.*;

public class secondprimenumber {
	/*进行n*1到5的循环   假如N=5
	 *   5 x 1 = 5 
	 *   5 x 2 = 10
	 *   5 x 3 = 15
	 *   5 x 4 = 20 
	 *   5 x 5 = 25 
	 *   5 x 6 = 30 
	 *   5 x 7 = 35
	 *   5 x 8 = 40 
	 *   5 x 9 = 45 
	 *   5 x 10 = 50
	 */
	   
 private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int a =1;
        for(;a<=10;a++) {
        	 int result=(N*a);
     		
             System.out.println(N+" "+"x"+" "+ a +" "+ "="+" " +N*a);
        	}/*
        	2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20*/
        
        scanner.close();
    }
}