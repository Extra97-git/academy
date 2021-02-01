package by.academy.homework.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Imput 2 strings with even amount of symbols");
		String str1 = scan.next();
		String str2 = scan.next();
		scan.close();
		if (str1.length() % 2 != 0 || str2.length() % 2 != 0) {
			System.out.println("Invalid input");
			return;
		}

		String answer = str1.substring(0, str1.length() / 2) + str2.substring(str2.length() / 2);
		System.out.println(answer);
	}
}
