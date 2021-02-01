package by.academy.homework.homework2;

import java.util.Scanner;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		int amountOfCards = 52;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		String[] deck = { "2 hearts", "2 spades", "2 clubs", "2 diamonds", "3 hearts", "3 spades", "3 clubs",
				"3 diamonds", "4 hearts", "4 spades", "4 clubs", "4 diamonds", "5 hearts", "5 spades", "5 clubs",
				"5 diamonds", "6 hearts", "6 spades", "6 clubs", "6 diamonds", "7 hearts", "7 spades", "7 clubs",
				"7 diamonds", "8 hearts", "8 spades", "8 clubs", "8 diamonds", "9 hearts", "9 spades", "9 clubs",
				"9 diamonds", "10 hearts", "10 spades", "10 clubs", "10 diamonds", "J hearts", "J spades", "J clubs",
				"J diamonds", "Q hearts", "Q spades", "Q clubs", "Q diamonds", "K hearts", "K hearts", "K clubs",
				"K diamonds", "A hearts", "A hearts", "A clubs", "A diamonds" };
		System.out.println("Insert number of players (2-10)");
		int n = scan.nextInt();
		scan.close();
		if (n < 2 || n > 10) {
			System.out.println("Invalid amount of players");
			return;
		}
		
		for (int i = 0; i < (n * 5); i++) {
			if((i) % 5 == 0) {
				System.out.println("\nPlayer " + (i/5 + 1));
			}
			String[] deckTemp = new String[amountOfCards];
			int counter = 0;
			int cardNum = random.nextInt(deck.length - i);
			String card = deck[cardNum];
			System.out.print(card + " | ");
			
			for (int j = 0; j < deck.length - i; j++) {
				if (j == cardNum) {
					continue;
				}
				deckTemp[counter] = deck[j];
				counter++;
			}
			deck = deckTemp;
		}
	}
}
