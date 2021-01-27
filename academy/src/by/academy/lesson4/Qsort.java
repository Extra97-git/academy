package by.academy.lesson4;

public class Qsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {2,6,4,1,7,9};
		int temp = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < (array.length - 1);j++) {
				if( array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for(int n : array) {
		
		System.out.println(n + " ");
		}
	}
}
