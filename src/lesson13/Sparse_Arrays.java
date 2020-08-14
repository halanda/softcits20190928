package lesson13;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sparse_Arrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {

    		int n = strings.length;
    		int qn = queries.length;
    		int[] result = new int[qn];
    		for(int i=0;i<qn;i++){
    			String temp = queries[i];
    			for(int j=0;j<n;j++){
    				if(strings[j].equals(temp))
    					result[i] = result[i] + 1;
    			}
    		}
    		return result;
        }

 
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
