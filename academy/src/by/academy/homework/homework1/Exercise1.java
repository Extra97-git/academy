package by.academy.homework.homework1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Insert total price of cart (rub).");
		int money = scn.nextInt();
		System.out.println("Insert age.");
		int age = scn.nextInt();
		scn.close();

		if (money < 100) {
			money *= 0.95;
		} else if (money < 200) {
			money *= 0.93;
		} else if (money < 300) {
			if (age > 18) {
				money *= 0.86;
			} else {
				money *= 0.91;
			}
		} else if (money < 400) {
			money *= 0.85;
		} else {
			money *= 0.8;
		}

		System.out.println("Final price is: " + money);

	}

}
