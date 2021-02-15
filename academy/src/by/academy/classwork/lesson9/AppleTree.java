package by.academy.classwork.lesson9;

public class AppleTree extends Tree {
	
	String applesType;
	
	public void getMoreFruits() {
		super.getMoreFruits();
		if(numOfFruits > 10) {
			numOfFruits -= 2;
		}
	}
	
	

}
