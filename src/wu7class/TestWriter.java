package wu7class;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import jdk.jfr.events.FileWriteEvent;

public class TestWriter {

	public static void main(String[] args) {
		
		File file = new File("D:\\test8.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			String str1 = "我爱你中国1";
			String str2 = "我爱你中国4";
			bw.write(str1);
			bw.newLine();
			bw.write(str2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				bw.flush();
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
