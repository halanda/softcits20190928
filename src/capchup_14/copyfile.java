package capchup_14;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class copyfile {

	public static void main(String[] args) {
		//输入流的源
		File file=new File("D:\\abc.txt");  
		//输出的目的地  当前文件下abc.txt
		File file1=new File("D:\\abc - 副本.txt");
		
//		if(!file.exists()) {
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		//声明输入流对象、输出流对象
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream(file);
			out=new FileOutputStream(file1);
			//调用方法
			//存放读取的数据
			byte b[]=new byte[1024];	
			//读取的字节数
			int len=-1;					
			while((len=in.read(b))!=-1){
			//将读入的字节数组写到当前文件夹下的abc.txt文件中
				out.write(b);			
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally{		
			//关闭输入输出流 先打开后关闭
			
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
