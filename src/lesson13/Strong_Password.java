package lesson13;
    import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Strong_Password {

	    // Complete the minimumNumber function below.
	    static int minimumNumber(int n, String password) {
	        // 方法一
            int count = 0;
	        
	        if(!password.matches(".*[a-z]+.*")){
	            count++;
	        }
	        if(!password.matches(".*[A-Z]+.*")){
	            count++;
	        }
	        if(!password.matches(".*[0-9]+.*")){
	            count++;
	        }
	        if(!password.matches(".*[-!@#$%^&*()+]+.*")){
	            count++;
	        }
	        return Math.max(count, 6-n);
	    	
//	        方法二
//	        int ans = 0;
//	        if(n>=6){
//	            if(!password.matches(".*[\\d].*")){ ans++;}
//	            if(!password.matches(".*[a-z].*")){ ans++;}
//	            if(!password.matches(".*[A-Z].*")){ ans++;}
//	            if(!password.matches(".*[\\W].*")){ ans++;}
//	        }
//	        else{
//	            int len = password.length();
//	            if(!password.matches(".*[\\d].*")){ ans++; len++;}
//	            if(!password.matches(".*[a-z].*")){ ans++; len++;}
//	            if(!password.matches(".*[A-Z].*")){ ans++; len++;}
//	            if(!password.matches(".*[\\W].*")){ ans++; len++;}
//	            if(len<6){
//	                ans = ans + (6-len);
//	            }
//	        }
//
//	        return ans;
//		    
	    	
	    }

	   
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String password = scanner.nextLine();

	        int answer = minimumNumber(n, password);

	        bufferedWriter.write(String.valueOf(answer));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}
