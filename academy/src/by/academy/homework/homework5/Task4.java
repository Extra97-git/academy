package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task4 {
	public ArrayList<Integer> marks = new ArrayList<Integer>();

	public int getBiggest() {
		Integer biggestMark = 0;
		int i = 0;
		Iterator<Integer> iter = marks.iterator();
		while (iter.hasNext()) {
			i = iter.next();
			if (i > biggestMark) {
				biggestMark = i;
			}
		}
		return biggestMark;
	}

	public void randomFill(int amount) {
		Random rand = new Random();
		while (marks.size() < amount) {
			marks.add(rand.nextInt(11));
		}
	}

}
