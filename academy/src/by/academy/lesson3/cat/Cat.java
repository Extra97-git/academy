package by.academy.lesson3.cat;

public class Cat {
	int age;
	String nickname;
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getNickname() {
		return this.nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public Cat() {
		super();
	}
	
	public Cat(String nickname) {
		super();
		this.nickname = nickname;
	}

	public void grow() {
		age++;
	}

	public void sleep() {
		System.out.println(this.nickname + " sleeps");
	}

	public void eat() {
		System.out.println(this.nickname + " eats");
	}

	public void walks() {
		System.out.println(this.nickname + " walks");
	}
	
	

}
