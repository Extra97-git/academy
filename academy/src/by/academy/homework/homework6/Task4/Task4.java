package by.academy.homework.homework6.Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		String srcText = "src/by/academy/homework/homework6/Task2/SourceText";
		Random rand = new Random();
		File folder = new File("src/by/academy/homework/homework6/Task4/junkyard");
		File result = new File("src/by/academy/homework/homework6/Task4/result.txt");

		String str;
		StringBuilder sb = new StringBuilder();

		if (!result.exists()) {
			try {
				result.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}

		if (!folder.exists()) {
			folder.mkdirs();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(srcText))) {

			while ((str = br.readLine()) != null) {
				sb.append(str);
			}

		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}

		try (BufferedWriter resultBw = new BufferedWriter(new FileWriter(result))) {
			for (int i = 0; i < 100; i++) {
				File temp = new File(folder, i + ".txt");
				if (!temp.exists()) {
					temp.createNewFile();
				}
				try (BufferedWriter tempBw = new BufferedWriter(new FileWriter(temp))) {
					tempBw.write(sb.substring(0, rand.nextInt(576)));
					resultBw.write(temp.getName() + " Size: " + temp.length() + " byte\n");
				} catch (IOException e) {
					System.out.println(e.getStackTrace());
				}
			}
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
}