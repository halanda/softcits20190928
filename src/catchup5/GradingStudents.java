package catchup5;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {

//    	for(int i =0; i<grades.size(); i++){   
//		    if(grades.get(i)>=38){ 
//		    if((grades.get(i)+2)%5==0)
//		    grades.set(i, (grades.get(i)+2));
//		   else if((grades.get(i)+1)%5==0)
//		    grades.set(i, (grades.get(i)+1));
//		    }   
//		}
//		return grades;
    	
    		List<Integer> result = new ArrayList<Integer>();
            for (int g : grades) {
                int mod = g % 5;
                if (g >= 36 && mod > 2) 
                    g = g + 5 - mod;
                result.add(g);
            }
            return result;
    	
    }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}