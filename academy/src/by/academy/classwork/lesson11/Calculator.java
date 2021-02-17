package by.academy.classwork.lesson11;

public class Calculator <T extends Number, K extends Number>{
	T value1;
	K value2;
	
	public Calculator(T value1, K value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public double sum() {
		return value1.doubleValue() + value2.doubleValue();
	}
	
	public double substract() {
		return value1.doubleValue() - value2.doubleValue();
	}
	
	public double multiply() {
		return value1.doubleValue() * value2.doubleValue();
	}
	
	public double devide() {
		return value1.doubleValue() / value2.doubleValue();
	}
	
	

}
