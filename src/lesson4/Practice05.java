package lesson4;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		/*
		 * ��֪���£� f(0)=1; 
		 * f(1)=2; 
		 * x>=2ʱ f(x)=f(x-1)+f(x-2); 
		   *    ����һ����x����ӡf(x)��ֵ
		 */
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
	
		System.out.println(fx(X));
		
	}
	
	public static int fx(int X) {
		
		int[] array = new int[X+1];
		
		for(int i=0;i<X+1;i++) {
			if(i==0) array[i]=1;
			else if(i==1) array[i]=2;
			else {
				array[i]=array[i-1]+array[i-2];
			}
		}
		return array[X];
	}

		
		

	}
