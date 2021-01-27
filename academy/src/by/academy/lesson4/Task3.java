package by.academy.lesson4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long b = 1;
		
		long a = scan.nextLong();
		scan.close();
		
		for(int i = 1; i < a; i++) {
			b = b * i;
		}
		
		System.out.println(b);

	}

}
