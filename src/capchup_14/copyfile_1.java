package capchup_14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyfile_1 {

	public static void main(String[] args) throws Exception {
		/**
		 * �����ļ����������ʵ���ļ�����
		 */
		String str = "D:\\abc.txt";
		String src = "D:\\abc - ����.txt";
        //������������in����fis��ǰ�棻Ϊ�ļ�������չ���幦�ܣ����IO���ܣ�ֻҪ����in�ķ����Ϳ��Ե����������
		FileInputStream fis = new FileInputStream(str);
		BufferedInputStream in = new BufferedInputStream(fis);
       //������������out����fos��ǰ�棻Ϊ�ļ�������չ���幦�ܣ����IO���ܣ�ֻҪ����in�ķ����Ϳ��Ե����������
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