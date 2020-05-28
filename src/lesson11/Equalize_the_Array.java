package lesson11;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Equalize_the_Array {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
    	
    	int [] arr1 = new int [101];
    	
    	//先遍歷arr數組然後叠加到arr1數組中
    	
    	for(int i=0;i<=arr.length;i++) {
    		arr1[arr[i]] ++;
    	}
    	//再遍历一次arr1数组找到最大值
    	int max = 0;
    	for(int i=0;i<arr1.length;i++) {
    		
    		if(arr1[i]>max) max=arr1[i];
    		
    	}
    	return arr.length - max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
