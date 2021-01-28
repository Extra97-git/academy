package by.academy.classwork.lesson5;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert number of strings");
		StringBuilder strBuild = new StringBuilder();

		int n = scan.nextInt();

		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Insert String");
			arr[i] = scan.next();
		}

		scan.close();

		for (int i = 0; i < n; i++) {
			strBuild.append(arr[i]);
			if (arr[i].equals(strBuild.reverse().toString())) {
				System.out.println(arr[i]);
			}
			strBuild.delete(0, arr[i].length());
		}
	}
}
