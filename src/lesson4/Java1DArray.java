package lesson4;
import java.util.*;
public class Java1DArray {

	public static void main(String[] args) {
		
		/* ¼��5 10 20 30 40 50 
		 *        ���        10 20 30 40 50
		 */
			   
		        Scanner scan = new Scanner(System.in);
		        int n = scan.nextInt();
		int[] a = new int [n];

		for (int j=0; j<n; j++) {
		        a[j] = scan.nextInt();
		}

		        scan.close();

		        // Prints each sequential element in array a
		        for (int i = 0; i < a.length; i++) {
		            System.out.println(a[i]);
		        }
		    }
		}
		     
		
