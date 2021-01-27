package by.academy.lesson4;

 import java.util.Scanner;
 
public class Task18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j = 0;
		
		System.out.println("Insert number");
		int a = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 !=0) {
				j++;
			}
		}
		System.out.println(j);
	}

}
