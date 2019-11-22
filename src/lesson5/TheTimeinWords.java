package lesson5;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheTimeinWords {
  //È±¸ö·µ»Ø
    static String timeInWords(int h, int m) {	
    	
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        int[] a = new int[n];
//        for(int i=0;i<a.length;i++)
//        	a[i]=scan.nextInt();
//        
//        scan.close();
    
       
        String[] numbers= {"one", "two", "three", "four", "five", "six", "seven", 
                "eight", "nine", "ten", "eleven", "twelve"};
        
        String[] numbers1 = {
                "zero","one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen",
                "nineteen","twenty","twenty one","twenty two","twenty three","twenty four",
                "twenty five","twenty six","twenty seven","twenty eight","twenty nine"
            };
        
    for (int i=0;i<numbers.length;i++) {
        
        String currentTime;
		if (m == 0) {
            currentTime = numbers[h] + " o' clock";
        }

        // **** at quarter past ****

        else if (m == 15) {
            currentTime = "quarter past " + numbers[h];
        }

        // **** at half hour ****

        else if (m == 30) {
            currentTime = "half past " + numbers[h];
        }

        // **** at quarter before ****

        else if (m == 45) {
            currentTime = "quarter to " + numbers[h + 1];
        }

        // **** before half hour ****

        else if (m < 30) {
            currentTime = numbers[m] + " minute" + (m <= 1 ? "" : "s") + " past " + numbers[h];
        }

        // **** past half hour ****

        else {
            currentTime = numbers[60 - m] + " minute" + ((60 - m) <= 1 ? "" : "s") + " to " + numbers[h + 1];
        }

        // **** display the current time ****

        System.out.println(currentTime);
    }
        
        
        
    }
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        System.out.println(result);

        scanner.close();
    }

