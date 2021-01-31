package by.academy.homework.homework2;

import java.util.Scanner;

public abstract class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Input number of Strings");
		int n = scan.nextInt();
		String[] lines = new String[n];
		int[] counters = new int[n];
		int smallestCounter = 0;
		int smallestCounterIndex = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Input String");
			lines[i] = scan.next();
		}

		scan.close();

		for (int i = 0; i < n; i++) {
			StringBuilder temp = new StringBuilder();
			;
			for (int j = 0; j < lines[i].length(); j++) {
				char checker = lines[i].charAt(j);
				if (temp.toString().indexOf(checker) == -1) {
					temp.append(checker);
				} else {
					continue;
				}
			}
			counters[i] = temp.length();
		}
		
		smallestCounter = counters[0];
		
		for(int i = 0; i < n; i++) {
			if(counters[i] < smallestCounter) {
				smallestCounter = counters[i];
				smallestCounterIndex = i;
			}
		}

		System.out.println(lines[smallestCounterIndex]);
	}
}
