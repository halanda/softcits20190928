package lesson03;

import java.util.Scanner;

public class primenumber {

	   //�ж�һ�������Ƿ�Ϊ�������������yes���������no

	public static void main(String[] args) {
		//�������
		Scanner scan = new Scanner (System.in);
	
		int a=scan.nextInt();
		
		//�жϿɲ����Ա�����
	   boolean result=false;
	   
        for(int i=2;i<a;i++) 
        {
         if (a%i==0){
         result=true;
        	   
           } 
         }
        if(result) {
        	System.out.append("No");	
        }
        else {
        System.out.append("Yes");
        }
		
	}

}
