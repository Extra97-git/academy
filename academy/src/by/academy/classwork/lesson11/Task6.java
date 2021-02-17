package by.academy.classwork.lesson11;

import java.io.Serializable;

public class Task6 <T extends Comparable<T> ,V extends Serializable,K extends Animal> {
	T object1;
	K object2;
	V object3;
	
	public Task6(T object1, K object2, V object3) {
		this.object1 = object1;
		this.object2 = object2;
		this.object3 = object3;
	}
	
	public T getT() {
		return object1;
	}
	
	public K getK() {
		return object2;
	}
	
	public V getV() {
		return object3;
	}
	
	public String getTName() {
		return object1.getClass().getCanonicalName();
	}
	
	public String getKName() {
		return object2.getClass().getCanonicalName();
	}
	
	public String getVName() {
		return object3.getClass().getCanonicalName();
	}
}
