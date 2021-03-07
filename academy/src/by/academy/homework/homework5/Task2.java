package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		LinkedList<Integer> lList = new LinkedList<>();
		
		Random rand = new Random();
		
		
		
		for(int i = 0; i <= 1_000_001; i++) {
			arrList.add(i);
		}
		System.out.println("ArrayList Filled");
		
		for(int i = 0; i <= 1_000_001; i++) {
			lList.add(i);
		}
		System.out.println("LinkedList filled");
		
		for(int i = 0; i <= 1_000_001; i++) {
			arrList.get(rand.nextInt(1_000_001));
		}
		System.out.println("Got values from ArrayList");
		
		for(int i = 0; i <= 1_000_001; i++) {
			lList.get(rand.nextInt(1_000_001));
		}
		System.out.println("Got values from LinkedList");
		

	}

}
