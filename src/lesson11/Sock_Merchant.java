package lesson11;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sock_Merchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		int[] color_arr = new int[101];
		for (int i = 0; i < ar.length; i++) {

			int index = ar[i];
			color_arr[index]++;

//			color_arr[ar[i]]++;
		}
		
//		int i=0;
//		while(i < ar.length) {
//			
//			int index = ar[i];
//			color_arr[index]++;
//			i++;
//		}
		

		int sum = 0;
		for (int i = 0; i < color_arr.length; i++) {

			sum += color_arr[i] / 2;

		}

		return sum;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
