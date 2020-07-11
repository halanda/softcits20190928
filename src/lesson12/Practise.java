package lesson12;
import java.util.Scanner;
public class Practise {

static String str_a, str_b;

	
	public static void main(String[] args) {
		//����0�±�����λ������
		int[] arr_a = new int[100];
		int[] arr_b = new int[100];
		
		int[] result;
		//��������
		Scanner scan = new Scanner(System.in);
		
		str_a = scan.nextLine();
		str_b = scan.nextLine();
		
		scan.close();
		
		
		string_to_intArray(str_a, arr_a);
		
		string_to_intArray(str_b, arr_b);
		
		result = add(arr_a, arr_b);
		
		print_result(result);

	}
	//�Ӻ���ǰ����string������λ���λ
	static void string_to_intArray(String str, int[] int_arr) {
		int j = 0;
		for(int i = str.length() - 1; i >= 0 ; i--) {
			int digit = (int)str.charAt(i) - (int)('0');
			int_arr[j] = digit;
			j++;
		}
	}
	

	static int[] add(int[] arr_a, int[] arr_b) {
		int[] result = new int[101];
		
		int length = max_length_arrays(arr_a, arr_b);
		
		for(int i = 0; i < length; i++) {
			result[i] = arr_a[i] + arr_b[i];
			//��Ҫ��λ�����
			if(result[i] > 9) {
				result[i] %= 10;
				//��λ+1
				result[i+1] += 1;
			}
		}
		
		return result;
	}
	
	//ȡ�����������󳤶�
	static int max_length_arrays(int[] arr_a, int[] arr_b) {
		
		if(arr_a.length >= arr_b.length) return arr_a.length; 
		else return
		  arr_b.length;
		//��Ŀ�����
		//	return arr_a.length >= arr_b.length ? arr_a.length : arr_b.length;
	}
	
	//���������飬����
	static void print_result(int[] result) {
		for(int i = get_index_of_highest_digit(result) - 1; i>=0 ;i--)
			System.out.print(result[i]);
	}
	
	//�ҵ���һ����Ϊ0�����λ���±�
	static int get_index_of_highest_digit(int[] result) {
		
		for(int i = result.length - 1; i >=0 ; i--) {
			if(result[i] != 0) {
				//????????
				return i+1;
			}
		}
		return 0;
	}

}

