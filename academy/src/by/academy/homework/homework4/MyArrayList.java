package by.academy.homework.homework4;

public class MyArrayList<T> {
	private T[] array;
	private int counter = 0;

	public MyArrayList() {
		super();
		array = (T[]) new Object[16];
	}

	public MyArrayList(int size) {
		super();
		array = (T[]) new Object[size];
	}

	private void ExpandArray() {
		T[] temp = (T[]) new Object[array.length * 2 + 1];
		System.arraycopy(array, 0, temp, 0, counter);
		array = temp;
	}

	public void add(T obj) {
		if (counter == array.length) {
			ExpandArray();
		}
		array[counter++] = obj;
	}

	public T get(int index) {
		if (index >= counter || index < 0) {
			System.out.println("Index put of bounds");
			return null;
		}
		return array[index];
	}

	public T getLast() {
		if (counter == 0) {
			System.out.println("ArrayList is empty");
			return null;
		}
		return array[counter - 1];
	}

	public T getFirst() {
		if (counter == 0) {
			System.out.println("ArrayList is empty");
			return null;
		}
		return array[0];
	}

	public int getSize() {
		return counter;
	}

	public int getLastElementIndex() {
		if (counter == 0) {
			System.out.println("ArrayList is empty");
			return -1;
		}

		return counter - 1;
	}

	public boolean removeByIndex(int i) {
		if (i >= 0 && i < counter) {
			System.arraycopy(array, i + 1, array, i, counter - i - 1);
			array[counter--] = null;
			return true;
		}
		return false;

	}

	public boolean removeByElment(T obj) {
		int index = 0;
		for (int i = 0; i < counter; i++) {
			if (array[i].equals(obj)) {
				index = i;
				System.arraycopy(array, index + 1, array, index, counter - index - 1);
				array[counter--] = null;
				return true;
			}
		}
		return false;
	}

}
