package by.academy.homework.homework1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println(" Input number");
		int num = scn.nextInt();
		scn.close();

		if ((num >= 1) && (num <= 10)) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num * i);
			}
		} else {
			System.out.println(" Number out of range");
		}                                                            
	}

}
