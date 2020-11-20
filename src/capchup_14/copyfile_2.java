package capchup_14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile_2 {

	/**
	 * java��һ���ļ������ݸ��Ƶ�����һ���ļ�
	 */

	public static void main(String[] args) {
		File af = new File("D:\\abc.txt");
		File bf = new File("D:\\abc - ����.txt");
		FileInputStream is = null;
		FileOutputStream os = null;
		if (!bf.exists()) {
			try {
				bf.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			is = new FileInputStream(af);
			os = new FileOutputStream(bf);
			byte b[] = new byte[1024];
			int len;
			try {
				len = is.read(b);
				while (len != -1) {
					os.write(b, 0, len);
					len = is.read(b);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				if (os != null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}