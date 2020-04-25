package lesson11;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.sun.org.apache.bcel.internal.generic.IFGT;

	public class DataTypes {
		
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);

	        Integer i1 = scan.nextInt();
	        double d1 = scan.nextDouble();
	        
	        
	        scan.nextLine();
	        String s1 = scan.nextLine();
	        
	        int x = i+i1;
	        double y = d+d1;
	        String w = s+s1;		
	        System.out.println(x);
	        System.out.println(y);
	        System.out.println(w);
	        
	        scan.close();
}
}