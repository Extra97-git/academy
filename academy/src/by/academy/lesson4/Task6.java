package by.academy.lesson4;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insert amount of money");
		double S = scan.nextDouble();
		System.out.println("Insert Year");
		int N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			S = S + S * 0.03;
		}
		
		System.out.println("After " + N + " years the sum is " + S );

	}

}
