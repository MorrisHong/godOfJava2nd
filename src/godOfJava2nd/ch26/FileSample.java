package godOfJava2nd.ch26;

import java.io.File;

public class FileSample {
	public static void main(String[] args) {
		FileSample sample = new FileSample();
		String pathName = File.separator + "Users" + File.separator + "govlmo91" + File.separator + "java_tmp"
				+ File.separator + "text";
		sample.checkPath(pathName);
		sample.makeDir(pathName);

	}

	public void checkPath(String pathName) {
		File file = new File(pathName);
		System.out.println(file);
		System.out.println(pathName + " is exists? = " + file.exists());
		System.out.println(file.getAbsolutePath());
	}

	public void makeDir(String pathName) {
		File file = new File(pathName);

		System.out.println("Make " + pathName + " result=" + file.mkdir());

	}

}
