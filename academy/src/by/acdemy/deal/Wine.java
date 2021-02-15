package by.acdemy.deal;

public class Wine extends Product {
	private String country;
	private String colour;
	private Integer age;
	private Integer volume;

	protected static final String[] templateWine = { "5.Add country of origin", "6.Add its colour", "7.Add its age",
			"8.Add volume" };

	public Wine(String name, Double price, String manufacturer, Integer quantity, String country, String colour,
			Integer age, Integer volume) {
		super(name, price, manufacturer, quantity);
		this.colour = colour;
		this.country = country;
		this.age = age;
		this.volume = volume;
	}

	public Wine(String name, Double price, String manufacturer, Integer quantity) {
		super(name, price, manufacturer, quantity);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public void wineAges() {
		age++;
		price = price + (price / 100 * 5);
	}

	public void drink(int howMuch) {
		volume = volume - howMuch;
	}

	public double discount() {
		if (country.equals("GE")) {
			return 0.83;
		} else {
			return 1;
		}
	}

	public String toString() {
		String str = super.toString() +  "\nCountry of origin: " + country + "\nColour: " + colour + "\nAge:" + age + "\nVolume: " + volume;
		return str;
	}

}
