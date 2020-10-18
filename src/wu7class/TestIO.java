package wu7class;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class TestIO {
public static void main(String[] args) {
//	File file = new File("D:\\IOtest1.txt");
//	System.out.println(file.getName());
//	System.out.println(file.length());
//	System.out.println(file.isFile());
//	System.out.println(file.canRead());
//	System.out.println(file.canWrite());
//	System.out.println(file.delete());
//	
//	新建
//	try {
//		file.createNewFile();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	判断是否是个路径
	File file = new File("D:\\");
//	System.out.println(file1.isDirectory());
////	看看你盘里还有多少空间
//	System.out.println(file1.getFreeSpace());
////  盘的总容量多少G 如果不除的话是多少byte
//	System.out.println(file1.getTotalSpace()/(1024*1024*1024));
//// 获取盘里所有的文件名	
//  File fp = new File("D:\\");
//  File[] arr = fp.listFiles();
//   for (int i = 0; i < arr.length; i++) {
//	System.out.println(arr[i].getName());
//}
//文件名的过滤
	
	FilenameFilter fft = new TestFile();
	File [] arr = file.listFiles(fft);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}	
	
}
}
