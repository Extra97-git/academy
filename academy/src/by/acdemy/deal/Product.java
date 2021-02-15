package by.acdemy.deal;

public abstract class Product {
	
	String name;
	Double price;
	String manufacturer;
	Integer quantity;
	protected String str = "Product: " + name + " \nPrice: " + price + "\nManufacturer: " + manufacturer + "\nQuantity: " + quantity;
	
	protected final static String[] templateProduct = {"1.Add name of this product", "2.Add price of this product", "3.Add manufacturer", "4.Add quantity of product"};
	
	public Product() {
		
	}
	
	public Product(String name, Double price, String manufacturer, Integer quantity){
		super();
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public abstract double discount();
	
	public double calcFinalPrice() {
		double finalPrice = quantity * price * discount();
		return finalPrice;
	}
	
	public String toString() {
		String str = "Product: " + name + " \nPrice: " + price + "\nManufacturer: " + manufacturer + "\nQuantity: " + quantity;
		return str;
	}
}
