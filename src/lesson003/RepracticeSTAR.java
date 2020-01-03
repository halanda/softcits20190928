package lesson003;

import java.util.Scanner;

public class RepracticeSTAR {

	public static void main(String[] args) {
		
//		键盘入力
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
//		打印列数
		
		for(int i=1;i<=N;i++) {
			
//		打印空格
			for(int s=N-i;s>=0;s--) {
				System.out.print(" ");
			}	
//		打印星星
		    for(int x=1;x<=i;x++) {
		    	System.out.print("*");
	    }	
//		打印回车
		    System.out.println();
		}

	}

}
