package lesson12;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 * 下列整型数组，求出数组元素的和， 
		 * 平均数，数组元素的最大值和最小值 ，并输出所求的结果。 
		 * 78,64,35,92,48,98,87,94,80,83
		 */
		
		int result = 0;
		double average;
		int[] arr = { 78, 64, 35, 92, 48, 98, 87, 94, 80, 83 };
		
		for (int i = 0; i <arr.length; i++)
		result += arr[i];
		System.out.println(result);
		
		average = result/arr.length;
		System.out.println(average);
		
		int max= arr[0];
		int min= arr[0];
		for(int i=0;i<arr.length; i++) {
			if(max<arr[i]) {
				max =arr[i];
			}
			if(min>arr[i]) {
			min =arr[i];
			}	
		}
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
	}
}
