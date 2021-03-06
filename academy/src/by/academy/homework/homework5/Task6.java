package by.academy.homework.homework5;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[8];
		try {
			for (int i = 0; i < 10; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is too small, please extend array");
		}
	}

}
