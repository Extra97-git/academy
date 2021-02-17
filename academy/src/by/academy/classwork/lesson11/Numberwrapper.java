package by.academy.classwork.lesson11;

public class Numberwrapper <T extends Number>{
	T value1;
	
	public T getValue1() {
		return value1;
	}

	public Numberwrapper(T value1) {
		super();
		this.value1 = value1;
	}
	
	public double plus(Numberwrapper<?> value2) {
		return value1.doubleValue() + value2. getValue1().doubleValue();
	}
	
	public double minus(Numberwrapper<?> value2) {
		return value1.doubleValue() - value2. getValue1().doubleValue();
	}
}
