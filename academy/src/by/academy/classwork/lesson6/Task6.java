
package by.academy.classwork.lesson6;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Task6 {
	
	public static boolean validate(String email) {
		Pattern pattern = Pattern.compile("[\\w]+@[\\w]+\\.[\\w]+");
		return pattern.matcher(email).matches();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(validate(s));
	}
}
