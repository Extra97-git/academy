package by.academy;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println(" Insert type of variable.");
		String dataType = scn.next();
		System.out.println(" Insert value of variable");

		switch (dataType) {
		case "int":
			int answerInt = scn.nextInt();
			System.out.println(answerInt % 2);
			break;
		case "double":
			double answerDouble = scn.nextDouble();
			System.out.println(answerDouble * 0.7);
			break;
		case "float":
			float answerFloat = scn.nextFloat();
			System.out.println(Math.pow(answerFloat, 2));
			break;
		case "char":
			char answerChar = scn.next().charAt(0);
			System.out.println((int) answerChar);
			break;
		case "String":
			String answerString = scn.next();
			System.out.println("Hello " + answerString);
			break;
		default:
			System.out.println(" Invalid type of variable");

		}

		scn.close();

	}

}
