package by.acdemy.deal;

public class Person {

	private Double money;
	private String name;
	private String telephone;
	private String email;
	private String dateOfBirth;

	public Person(Double money, String name, String telephone, String email) {
		super();
		this.money = money;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
	}
	
	public Person() {
		
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
