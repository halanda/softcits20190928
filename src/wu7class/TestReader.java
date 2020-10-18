package wu7class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
public static void main(String[] args) {
	

	File file = new File("D:\\test7.txt");
	FileReader fr = null;
	BufferedReader br = null;
	
	try {
		fr = new FileReader(file);
		br = new BufferedReader(fr);
	    String s = br.readLine();
	    while(s!=null) {
			System.out.println(s);
			s = br.readLine();
			}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}