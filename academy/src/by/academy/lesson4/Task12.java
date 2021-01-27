package by.academy.lesson4;

public class Task12 {

	public static void main(String[] args) {
		long result = 1;
		for(long i = 13; i < 100; i += 26) {
			result = result * i;
		}
		System.out.println(result);
	}

}

