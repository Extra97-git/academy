package by.academy.classwork.lesson16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;

public class Task5 {
	static File source;
	static File destination;
	
	public static void main(String[] args) {
		try(InputStream input = new FileInputStream(source);  OutputStream output = new FileOutputStream(destination)){
			for(int i = 0; i < input.available(); i++) {
				output.write(input.read());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
