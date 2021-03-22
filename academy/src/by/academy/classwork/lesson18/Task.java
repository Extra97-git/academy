package by.academy.classwork.lesson18;

import java.lang.reflect.*;

public class Task {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Tiger tiger = new Tiger();

		Class<? extends Cat> catClass = cat.getClass();
		Class<? extends Tiger> tigerClass = tiger.getClass();

		Method[] catMethods;
		try {
			catMethods = catClass.getMethods();
			System.out.println(catMethods);
		} catch (Exception e) {
			System.out.println("Exception 1");
		}

		Method[] tigerMethods;
		try {
			tigerMethods = tigerClass.getMethods();
			System.out.println(tigerMethods);
		} catch (Exception e) {
			System.out.println("Exception 2");
		}

		Field[] catFields;
		try {
			catFields = catClass.getDeclaredFields();
			for(Field k: catFields) {
				System.out.println(k.getName());
			}
		} catch (Exception e) {
			System.out.println("Exception 3");
		}

		Field[] tigerFields;
		try {
			tigerFields = tigerClass.getDeclaredFields();
			System.out.println(tigerFields);
		} catch (Exception e) {
			System.out.println("Exception 4");
		}

		try {
			
			Field catPrivateField = catClass.getDeclaredField("age");
			catPrivateField.setAccessible(true);
			catPrivateField.set(cat, 12);
			System.out.println(catPrivateField.get(cat));
		} catch (Exception e) {

			System.out.println("Exception 5");
		}
	}

}
