package by.academy.classwork.lesson11;

public class Task8 <T extends Number> {
	T[] arr;
	
	public Task8(T[] array) {
		this.arr = array;
	}
	
	public T min() {
		double temp = arr[0].doubleValue();
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(Double.compare(temp, arr[i].doubleValue()) > 0) {
				index = i;
				temp = arr[i].doubleValue();
			}
		}
		return arr[index];
	}
	
	public T max() {
		double temp = arr[0].doubleValue();
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(Double.compare(temp, arr[i].doubleValue()) == 0) {
				index = i;
				temp = arr[i].doubleValue();
			}
		}
		return arr[index];
	}
	
}
