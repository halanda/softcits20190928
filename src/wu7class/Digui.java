package wu7class;

import java.io.File;

public class Digui {

	public void showFileName(File file) {
		
		if (file!=null) {
			if (file.isDirectory()) {
				File [] arr = file.listFiles();
				if (arr!=null) {
					for (int i = 0; i < arr.length; i++) {
						showFileName(arr[i]);
					}
					
				}
				
			}else {
				System.out.println(file.getName());
			}
		}
		
	}
	
	public static void main(String[] args) {
		File file = new File("D:\\");
		Digui d = new Digui();
		d.showFileName(file);
	}
	
}
