package capchup_14;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class copyfile {

	public static void main(String[] args) {
		//��������Դ
		File file=new File("D:\\abc.txt");  
		//�����Ŀ�ĵ�  ��ǰ�ļ���abc.txt
		File file1=new File("D:\\abc - ����.txt");
		
//		if(!file.exists()) {
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//�����������������������
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream(file);
			out=new FileOutputStream(file1);
			//���÷���
			//��Ŷ�ȡ������
			byte b[]=new byte[1024];	
			//��ȡ���ֽ���
			int len=-1;					
			while((len=in.read(b))!=-1){
			//��������ֽ�����д����ǰ�ļ����µ�abc.txt�ļ���
				out.write(b);			
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally{		
			//�ر���������� �ȴ򿪺�ر�
			
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
