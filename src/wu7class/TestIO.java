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
//	�½�
//	try {
//		file.createNewFile();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	�ж��Ƿ��Ǹ�·��
	File file = new File("D:\\");
//	System.out.println(file1.isDirectory());
////	���������ﻹ�ж��ٿռ�
//	System.out.println(file1.getFreeSpace());
////  �̵�����������G ��������Ļ��Ƕ���byte
//	System.out.println(file1.getTotalSpace()/(1024*1024*1024));
//// ��ȡ�������е��ļ���	
//  File fp = new File("D:\\");
//  File[] arr = fp.listFiles();
//   for (int i = 0; i < arr.length; i++) {
//	System.out.println(arr[i].getName());
//}
//�ļ����Ĺ���
	
	FilenameFilter fft = new TestFile();
	File [] arr = file.listFiles(fft);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}	
	
}
}
