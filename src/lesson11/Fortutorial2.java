package lesson11;

import java.util.Scanner;

public class Fortutorial2 {

	public static void main(String[] args) {
		//用while函数输出 9223372036854775807中能被7整除的所有数
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		
		divisibleByseven(N);
		
	}

	public static void divisibleByseven(long limit) {
		
		long i = 1L;
		long result = i*7;
		
		while(result > 0 && result<= limit) {
		
				System.out.println(result);
			
			i++;
			result = i * 7;
			
		}
		
	}	
	
}
