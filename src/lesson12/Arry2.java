package lesson12;

public class Arry2 {
	public static void main(String[] args) {
		
//	计算下列数组中偶数个数，打印出奇数的序列{78，64，35，92，48，98，87，94，80，83}
		
//int[]  arr = new int[10];
//	
//	for(int i=0; i<arr.length; i++) 
//		arr[i] ++;
	
	int[] arr = {78,64,35,92,48,98,87,94,80,83};	
	
	int[] odd = new int[arr.length];
	int odd_num = 0; 
	
	int even = 0;
     
     for(int i : arr) {
			if(i % 2 == 0) {
				even++;
			}
			
			else {
				odd[odd_num] = i;
				odd_num++;
			}
}
     System.out.println(even);	
     
//     for(int i : arr) {
//			if(i%2!=0) {
//				System.out.print(i + " ");
//			}
			
			//print sequence of odd
			for(int i = 0; i < odd_num; i++)
			{
				System.out.println(odd[i]);
			}
}
}