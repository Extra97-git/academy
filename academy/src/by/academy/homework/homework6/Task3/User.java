package by.academy.homework.homework6.Task3;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private String surname;
	private Integer age;

	public User(String name, String surname, Integer age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Integer getAge() {
		return age;
	}
}
