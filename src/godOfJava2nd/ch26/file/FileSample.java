package godOfJava2nd.ch26.file;

import java.io.File;
import java.util.Date;

public class FileSample {
	public static void main(String[] args) {
		FileSample sample = new FileSample();
		String pathName = File.separator + "Users" + File.separator + "govlmo91" + File.separator + "java_tmp"
				+ File.separator + "text";
		sample.checkPath(pathName);
		sample.makeDir(pathName);
		sample.checkFileMethods(pathName);
		sample.callFileMethods(pathName);
		sample.lastModified(pathName);
	}

	public void checkPath(String pathName) {
		File file = new File(pathName);
		System.out.println(file);
		System.out.println(pathName + " is exists? = " + file.exists());
		System.out.println(file.getAbsolutePath());
	}

	public void makeDir(String pathName) {
		File file = new File(pathName);

		System.out.println("Make " + pathName + " result=" + file.mkdirs());

	}
	
	public void checkFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " is directory? = " + file.isDirectory());
		System.out.println(pathName + " is file? ="+file.isFile());
		System.out.println(pathName + " is hidden? = "+file.isHidden());
	}
	public void callFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " can read? = "+file.canRead());
		System.out.println(pathName + " can write? = "+file.canWrite());
		System.out.println(pathName + " can execute? = "+file.canExecute());
	}
	public void lastModified(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName + " last modified = "+new Date(file.lastModified()));
	}

}
