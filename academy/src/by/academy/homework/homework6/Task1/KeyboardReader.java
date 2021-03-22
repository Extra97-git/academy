package by.academy.homework.homework6.Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyboardReader {

	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		File destination = new File("src/by/academy/homework/homework6/Task1/file");

		if (!destination.exists()) {
			try {
				destination.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}

		try (FileWriter stream = new FileWriter(destination)) {
			str = scan.nextLine();
			while (!"stop".equals(str)) {
				stream.append(str);
				str = scan.nextLine();
			}

		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
		scan.close();

	}
}
