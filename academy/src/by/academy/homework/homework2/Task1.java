package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		String answer = str1 + "  " + str2 + ": ";
		StringBuilder strBuilder = new StringBuilder(str2);

		scan.close();

		if (str2.length() != str1.length()) {
			System.out.println(answer + false);
			return;
		}

		for (int i = 0; i < str2.length(); i++) {
			String checker = Character.toString(str1.charAt(i));
			int position = strBuilder.lastIndexOf(checker);
			if (position == -1) {
				System.out.println(answer + false);
				return;
			}
			strBuilder.replace(position, (position + 1), " ");
		}
		
		if (strBuilder.toString().isBlank()) {
			System.out.println(answer + true);
		}
	}
}
