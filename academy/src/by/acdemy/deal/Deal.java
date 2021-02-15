package by.acdemy.deal;

import java.util.Scanner;
import java.time.LocalDate;
public class Deal {
	private Person buyer = new Person();
	private Person seller = new Person();
	private Product[] products = new Product[10];
	private String date;
	private int trueArrLength = 0;
	private boolean isDealExecuted = false;
	public LocalDate deadline = LocalDate.now().plusDays(10);
	
	

	private final static Scanner scan = new Scanner(System.in);

	private final static String dealMenu = "What is your orders master(insert number)" + "\n1.View Bill."
			+ "\n2.Add Products" + "\n3.Remove Products" + "\n4.Execute Deal" + "\n5.View product list" + "\n6.Exit";

	private final static String addProductMenu = "Which product type my master wishes to add" + "\n1.Wine"
			+ "\n2.Cheese" + "\n3.Meat";

	private final static String anotherAction = "Would you like to continue my master?" + "\n1.Continue" + "\n2.Exit";

	public Deal(Person buyer, Person seller, String date, Product... products) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.date = date;
		this.products = products;
		trueArrLength = products.length;
	}

	public Deal() {

	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		
	}

	public void dealMenu() {
		do {
			System.out.println(dealMenu);
			switch (scan.nextInt()) {
			case 1:
				printBill();
				break;
			case 2:
				addProductMenu();
				break;
			case 3:
				System.out.println("Insert name of product");
				removeProduct(scan.nextLine());
				break;
			case 4:
				deal();
				break;
			case 5:
				viewProducts();
				break;
			case 6:
				return;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (anotherAction());
		scan.close();

	}

	public void addProductMenu() {
		System.out.println("#################\n" + addProductMenu);
		int answer = scan.nextInt();
		
		System.out.println(Product.templateProduct[0]);
		String name = scan.next();
		
		System.out.println(Product.templateProduct[1]);
		Double price = scan.nextDouble();
		
		System.out.println(Product.templateProduct[2]);
		String manufacturer = scan.next();
		
		System.out.println(Product.templateProduct[3]);
		int quantity = scan.nextInt();
		
		switch (answer) {
		case 1:
			Wine wine = new Wine(name, price, manufacturer, quantity);
			System.out.println(Wine.templateWine[0]);
			wine.setCountry(scan.next());
			
			System.out.println(Wine.templateWine[1]);
			wine.setColour(scan.next());
			
			System.out.println(Wine.templateWine[2]);
			wine.setAge(scan.nextInt());
			
			System.out.println(Wine.templateWine[3]);
			wine.setVolume(scan.nextInt());
			
			addProduct(wine);
			break;
		case 2:
			Cheese cheese = new Cheese(name, price, manufacturer, quantity);
			System.out.println(Cheese.templateCheese[0]);
			cheese.setType(scan.next());
			
			System.out.println(Cheese.templateCheese[1]);
			cheese.setAge(scan.nextInt());
			
			System.out.println(Cheese.templateCheese[2]);
			cheese.setAmountOfHoles(scan.nextInt());
			
			addProduct(cheese);
			break;
		case 3:
			Meat meat = new Meat(name, price, manufacturer, quantity);
			System.out.println(Meat.templateProduct[0]);
			meat.setAnimalSpecies(scan.next());
			
			System.out.println(Meat.templateProduct[1]);
			meat.setBodyPart(scan.next());
			
			addProduct(meat);
			break;
		default:
			System.out.println("Invalid input");
			break;
		}

	}

	private void viewProducts() {
		System.out.println("#################\n");
		for (int i = 0; i < trueArrLength; i++) {
			System.out.println(products[i].toString());
		}
	}

	public static boolean anotherAction() {
		System.out.println("#################\n" + anotherAction);
		switch (scan.nextInt()) {
		case 1:
			return true;
		case 2:
			return false;
		default:
			System.out.println("Invalid input");
			return true;
		}
	}

	private void removeProduct(String name) {
		if (trueArrLength == 0) {
			System.out.println("Product list is empty");
			return;
		}
		for (int i = 0; i < trueArrLength; i++) {
			if (products[i].getName().equals(name)) {
				Product temp = products[trueArrLength - 1];
				products[trueArrLength - 1] = products[i];
				products[i] = temp;
				trueArrLength--;
				break;
			}
		}
	}

	public void addProduct(Product product) {
		if (products.length == trueArrLength) {
			expandProducts();
		}
		products[trueArrLength] = product;
		trueArrLength++;
	}

	private void expandProducts() {
		Product[] temp = new Product[products.length * 2 + 1];
		for (int i = 0; i < products.length; i++) {
			temp[i] = products[i];
		}
		products = temp;
	}

	private double sum() {
		double sum = 0;

		for (int i = 0; i < trueArrLength; i++) {
			sum += products[i].calcFinalPrice();
		}
		return sum;
	}

	private void deal() {
		System.out.println("#################\n");
		if (isDealExecuted) {
			System.out.println("Deal is already executed.");
		} else {
			double sum = sum();
			if (buyer.getMoney() >= sum) {
				buyer.setMoney(buyer.getMoney() - sum);
				seller.setMoney(seller.getMoney() + sum);
				isDealExecuted = true;
			} else {
				System.out.println("Buyer has insufficient funds");
			}

		}
	}

	private void printBill() {
		System.out.println("#################\n");
		
		System.out.println(date);
		System.out.println(
				"Seller: " + seller.getName() + "  Tel: " + seller.getTelephone() + "  email: " + seller.getEmail());
		System.out.println(
				"Buyer: " + buyer.getName() + "  Tel: " + buyer.getTelephone() + "  email: " + buyer.getEmail());

		for (int i = 0; i < trueArrLength; i++) {

			System.out.print(products[i].getName() + " " + products[i].getPrice() + " X " + products[i].getQuantity()
					+ " = " + products[i].calcFinalPrice());

			if (products[i].discount() != 1) {
				System.out.println(" With " + (int) ((1 - products[i].discount()) * 100) + "% discount");
			} else {
				System.out.println();
			}
		}
		System.out.println("Total " + sum());
	}
}
