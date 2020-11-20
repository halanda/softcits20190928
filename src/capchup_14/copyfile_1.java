package capchup_14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyfile_1 {

	public static void main(String[] args) throws Exception {
		/**
		 * 利用文件输入输出流实现文件复制
		 */
		String str = "D:\\abc.txt";
		String src = "D:\\abc - 副本.txt";
        //将缓冲输入流in套在fis的前面；为文件输入扩展缓冲功能，提高IO性能，只要调用in的方法就可以调用这个功能
		FileInputStream fis = new FileInputStream(str);
		BufferedInputStream in = new BufferedInputStream(fis);
       //将缓冲输入流out套在fos的前面；为文件输入扩展缓冲功能，提高IO性能，只要调用in的方法就可以调用这个功能
		FileOutputStream fos = new FileOutputStream(src);
		BufferedOutputStream out = new BufferedOutputStream(fos);
		int n;
		while ((n = in.read()) != -1) {
			out.write(n);
		}
		/*
		 * byte []bytes =new byte[1024*8]; int b; while ((b=in.read(bytes))!=-1) {
		 * out.write(bytes,0,b); }
		 */
		in.close();
		out.close();
		System.out.println("ok");
	}
}