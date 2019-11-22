package lesson05;

public class MyCalculator implements AdvancedArithmetic1 {
	
	int i =0;
	
	public int divisor_sum(int n) {
      
		int sum =n;
		for (int i=1; i<=n/2;i++) {
			
			if(n%i==0)
				sum += i;
			
		}	
		return sum;
	}

}
