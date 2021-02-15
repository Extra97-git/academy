package by.academy.classwork.lesson9;

public class Tree extends Plant{
	
	protected boolean hasFlowers = false;
	
	public void blooms() {
		hasFlowers = true;
	}
	
	public void getMoreFruits() {
		if (hasFlowers) {
			numOfFruits++;
			hasFlowers = false;
		}
	}
}
