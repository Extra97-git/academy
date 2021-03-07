package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Task1  {
	
	public static Collection<Object> withoutDuplicates(Collection<Object> collection) {
		return new HashSet<Object>(collection);
	}
	public static void main(String[]  args) {
		Collection<Object> list = new ArrayList<>();
		list.add("Max");
		list.add("Max");
		list.add("Vanya");
		list.add("Leo");
		list.add("Max");
		list.add("Vanya");
		
		System.out.println(list);
		
		list = withoutDuplicates(list);
		
		System.out.println(list);
	}
}
