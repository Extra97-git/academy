package by.academy.homework.homework6.Task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SpaceDeleter {

	public static void main(String[] args) {
		int temp;
		File result = new File("src/by/academy/homework/homework6/Task2/result.txt");

		if (!result.exists()) {
			try {
				result.createNewFile();
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}
		}

		try (BufferedReader reader = new BufferedReader(
				new FileReader("src/by/academy/homework/homework6/Task2/SourceText"));
				BufferedWriter writer = new BufferedWriter(new FileWriter(result))) {

			while ((temp = reader.read()) != -1) {
				if (temp == 32) {
					continue;
				}
				writer.write(temp);
			}
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}

	}
}
