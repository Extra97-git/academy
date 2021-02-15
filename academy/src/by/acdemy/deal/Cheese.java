package by.acdemy.deal;

public class Cheese extends Product{
	
	private String type;
	private Integer age;
	private int amountOfHoles;
	
	protected static final String[] templateCheese = {"5.Add its type", "6.Add its age", "7.How many holes does it have"};
	
	public Cheese(String name, Double price, String manufacturer, Integer quantity, String type, Integer age, int amountOfHoles) {
		super(name, price, manufacturer, quantity);
		this.type = type;
		this.age = age;
		this.amountOfHoles= amountOfHoles;
		// TODO Auto-generated constructor stub
	}
	
	public Cheese(String name, Double price, String manufacturer, Integer quantity) {
		super(name, price, manufacturer, quantity);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
	public int getAmountOfHoles() {
		return amountOfHoles;
	}

	public void setAmountOfHoles(int amountOfHoles) {
		this.amountOfHoles = amountOfHoles;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	public boolean goesWithWine() {
		if (type.equals("jill")) {
			return false;
		} else {
			return true;
		}
	}
	
	public double discount() {
		if(amountOfHoles > 20) {
			return 0.8;
		} else {
			return 1;
		}
	}
	
	public String toString() {
		String str = super.toString() + "\nType: " + type + "\nAge: " + age + "\nAmount of holes: " + amountOfHoles;
		return str;
	}
}
