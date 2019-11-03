package lesson4;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the primality function below.
    static String primality(int n) {
    	
    	
		//判断可不可以被整除
		if(n==1)return("Not Prime");
		else if(n==2)return("Prime");
		
		for(int i=2;i<n;i++)
		  if(n%i==0)
			  return("Not Prime");
		return("Prime");
    }
    
    
    
    
		
	   
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int pItr = 0; pItr < p; pItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = primality(n);
            
            System.out.println(result);
            
        }

   

        scanner.close();
    }
}