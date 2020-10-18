package wu7class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {
public static void main(String[] args) {
	File file = new File("D:\\test2.txt");
	
	try {
		file.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		FileOutputStream fos = new FileOutputStream(file);
		
		String str = "ÎÒ°®ÄãÖÐ¹ú";
		byte [] arr = str.getBytes();
		fos.write(arr);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
