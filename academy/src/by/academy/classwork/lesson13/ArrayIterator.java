package by.academy.classwork.lesson13;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T>{
	
	private T[] array;
	private int cursor = 0;
	
	public ArrayIterator(T[] array) {
		this.array = array;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasNext() {
		if(array == null || cursor >= array.length) {
			return false;
		}
		
		if(array[cursor] == null) {
			return false;
		}
		
		return true;
		
		
	}
	@Override
	public T next() {
		// TODO Auto-generated method stub
		return array[cursor++];
	}
	
}
