package lesson11;
    import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Day7_Arrays {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }
//	        int[] brr=new int[n];
//	        int j=0;
//	        for(int i=arr.length-1;i>=0;i--) {
//
//	            brr[j]=arr[i];
//
//	            j++;
//	        }
//	        for(int i=0;i<brr.length;i++)
//	        {
//	        System.out.print(brr[i]+" ");
//	                }
	        
	        
	        for (int i = arr.length-1; i >= 0; i--) 
	        {  
	            System.out.print(arr[i] + " "); 
	        }
	        scanner.close();
	    }
	}
