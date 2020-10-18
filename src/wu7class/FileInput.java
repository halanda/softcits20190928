package wu7class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {
public static void main(String[] args) {
	File file = new File("D:\\test3.txt");
	
	try {
		file.createNewFile();
FileOutputStream fos = new FileOutputStream(file);
		
		String str = "ÎÒ°®ÄãÖÐ¹ú";
		byte [] arr = str.getBytes();
		fos.write(arr);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
