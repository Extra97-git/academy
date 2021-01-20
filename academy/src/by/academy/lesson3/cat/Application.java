package by.academy.lesson3.cat;

public class Application {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat("Jingles");
		
		c1.grow();
		c1.eat();
		c1.sleep();
		c1.walks();
		
		c2.grow();
		c2.grow();
		c2.grow();
		c2.grow();
		c2.eat();
		c2.sleep();
		c2.walks();
		
		System.out.println(c2.getNickname() + " is " + c2.age + "years old");
		
		
		

	}

}
