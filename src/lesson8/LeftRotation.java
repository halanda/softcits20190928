package lesson8;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

//        Scanner sc = new Scanner(System.in);
//        
//        int [] arr = new int [n];
//        for(int i =0; i<arr.length;i++){
//            arr[(i-d+n)%n] = sc.nextInt();
//        }
//        for(int i =0; i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
        
        int temp =0;
        for(int i=0;i<d;i++){
//        	����һ��Ԫ�ر�����temp��
              temp = a[0];
            for(int j=0;j<n-1;j++){
//             ������ÿһ��Ԫ����ǰ�ƶ�һλ
              a[j]=a[j+1];  
            }
//            �������һ��Ԫ��Ϊ��һ��Ԫ��ֵ��temp
            a[n-1]=temp;
        }
        for(int i=0;i<n;i++){

            System.out.print(a[i]+" ");
        }
        
        
        scanner.close();
    }
}
