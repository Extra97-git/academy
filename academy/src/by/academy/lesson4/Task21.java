package by.academy.lesson4;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double a = 0;
		
		for( double i = 2; i <= n; i += 2) {
			a = a + 1/(i * i);
		}
		
		System.out.println(a);

	}

}
