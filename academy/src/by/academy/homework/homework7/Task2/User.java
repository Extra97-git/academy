package by.academy.homework.homework7.Task2;

public class User extends Person{

	



	private String login; 
	private String password;
	public String email;
	
	
	public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password,
			String email) {
		super(firstName, lastName, age, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", email=");
		builder.append(email);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", getLastName()=");
		builder.append(getLastName());
		builder.append(", getAge()=");
		builder.append(getAge());
		builder.append(", getDateOfBirth()=");
		builder.append(getDateOfBirth());
		builder.append("]");
		return builder.toString();
	}
	
	public void printUserInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append(login + "\r ").append(password + "\r ").append(email + "\r ");
		System.out.println(sb);
	}

}
