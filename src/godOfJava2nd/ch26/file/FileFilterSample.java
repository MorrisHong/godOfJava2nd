package godOfJava2nd.ch26.file;

import java.io.File;

public class FileFilterSample {
	public static void main(String[] args) {
		FileFilterSample sample = new FileFilterSample();
		String pathName = File.separator + "users" + File.separator + "govlmo91"
				+File.separator+"java_tmp"+File.separator+"text";
		sample.checkList(pathName);
		
	}
	public void checkList(String pathName) {
		File file;
		try {
			file = new File(pathName);
//			File[] mainFileList = file.listFiles();
			File[] mainFileList = file.listFiles(new JPGFileFilter());
			
			for(File f : mainFileList) {
				System.out.println(f.getName());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
