package by.academy.classwork.lesson11;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] arr = {1.0000000001,6.1231241241241,- 3.21414141241,6.3298685134745124,- 8.3219461975461874,9.87248154,1.89639846295};
		Task8<Double> test = new Task8<>(arr);
		
		System.out.println(test.max());
		System.out.println(test.min());
	}

}
