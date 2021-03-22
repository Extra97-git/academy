package by.academy.classwork.lesson17;

import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileCopy {
	private FileOutputStream fos;
	private FileInputStream fis;

	public FileCopy(String destination, String source) {
		super();
		try {
			fos = new FileOutputStream(destination);
			fis = new FileInputStream(source);
		} catch (Exception e) {
			System.out.println("Invalid destination/source");
		}
	}

	public void copy() {
		try {
			fos.write(fis.readAllBytes());
		} catch (Exception e) {
			System.out.println("Oops, smthing went wrong");
		}
	}

}
