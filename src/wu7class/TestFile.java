package wu7class;

import java.io.File;
import java.io.FilenameFilter;

public class TestFile implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		if (name.endsWith(".txt")) {
			return true;
			
		}else{
			return false;	
			}
		}
		
	}

	
