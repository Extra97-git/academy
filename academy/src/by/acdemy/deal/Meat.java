package by.acdemy.deal;

public class Meat extends Product{
	private String animalSpecies;
	private String bodyPart;
	private static final String[] templateMeat = {"5. Add animal species", "6. Add body part"};
	
	public Meat(String name, Double price, String manufacturer, Integer quantity, String animalSpecies, String bodyPart) {
		super(name, price, manufacturer, quantity);
		this.animalSpecies = animalSpecies;
		this.bodyPart = bodyPart;
	}
	public Meat(String name, Double price, String manufacturer, Integer quantity) {
		super(name, price, manufacturer, quantity);
	}
	
	public String getAnimalSpecies() {
		return animalSpecies;
	}
	public void setAnimalSpecies(String animalSpecies) {
		this.animalSpecies = animalSpecies;
	}
	public String getBodyPart() {
		return bodyPart;
	}
	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}
	
	public double discount() {
		if(this.quantity > 20) {
			return 0.92;
		} else {
			return 1.0;
		}
	}
	
	public String toString() {
		String str = super.toString() + "\nAnimal species: " + animalSpecies + "\nBody part" + bodyPart;
		return str;
	}
	
	
	
	
}
