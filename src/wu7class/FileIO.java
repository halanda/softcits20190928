package wu7class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:\\test.txt");
		try {
			FileInputStream fis = new FileInputStream((file));
			System.out.println((char)(fis.read()));
			System.out.println((char)(fis.read()));
			System.out.println((char)(fis.read()));
			System.out.println((char)(fis.read()));
			System.out.println((char)(fis.read()));
			System.out.println((char)(fis.read()));
			System.out.println((char)(fis.read()));
			System.out.println((char)(fis.read()));
			System.out.println((char)(fis.read()));
			System.out.println((char)(fis.read()));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
