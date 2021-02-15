package by.academy.classwork.lesson9;

public abstract class Plant {
	
	protected int size;
	protected int numOfFruits;
	
	protected abstract void getMoreFruits();
	
	public void grow() {
		getMoreFruits();
		size++;
	}
	
	

}
