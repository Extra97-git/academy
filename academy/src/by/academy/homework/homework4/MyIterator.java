package by.academy.homework.homework4;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

	private static int pointer1stDimension = 0;
	private static int pointer2ndDimension = 0;
	private T[][] array;

	public MyIterator(T[][] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return array[pointer1stDimension][pointer2ndDimension] != null;
	}

	@Override
	public T next() {
		T temp = array[pointer1stDimension][pointer2ndDimension++];
			if(pointer2ndDimension >= array[pointer1stDimension].length) {
				pointer1stDimension++;
				pointer2ndDimension = 0;
			}
		return temp;
	}

}
