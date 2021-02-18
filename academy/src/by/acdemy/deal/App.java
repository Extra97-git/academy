package by.acdemy.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

import by.acdemy.deal.validator.*;

public class App {

	private Deal[] deals = new Deal[10];
	private int dealCounter = 0;
	
	BelPhoneValidator belValidator = new BelPhoneValidator();
	EmailValidator emailValidator = new EmailValidator();

	public App() {
		super();
	}

	public static void main(String[] args) throws ParseException {
		System.out.println("Instead of space us _");
		App appDemo = new App();
		appDemo.dealsMenu();
	}

	public void dealsMenu() throws ParseException {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("What are your commands master?" + "\n1.Create new deal" + "\n2.Edit\\view existing deal"
					+ "\n3.Exit");
			switch (scan.nextInt()) {
			case 1:
				createNewDeal(scan);
				break;
			case 2:
				if (dealCounter == 0) {
					System.out.println("No deals in sight Captain!");
					break;
				}
				deals[chooseDeal(scan)].dealMenu();
				break;
			case 3:
				scan.close();
				return;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (Deal.anotherAction(scan));
		scan.close();
	}

// Menu that calls private methods from class to create new deal
	private void createNewDeal(Scanner scan) throws ParseException {
		System.out.println("Okay, lets create new deal");
		if (dealCounter == deals.length) {
			expandArray();
		}
		deals[dealCounter] = new Deal();
		createSeller(scan);
		createBuyer(scan);
		setDealDate(scan);
		dealCounter++;

	}

//Time validation + formatting that feels totaly like a hack (i will remake it with Calendar later... probably...)
//Откровенно говоря, я вообще не вьехал как работать с более современными форматами...
	private void setDealDate(Scanner scan) throws ParseException {
		System.out.println("Add date in dd/mm/yyyy or dd-mm-yyyy format");
		String date = scan.next();
		if (DateValidator.getDateSlash(date)) {
			Date dateTemp = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			deals[dealCounter].setDate(
					"Day: " + dateTemp.getDay() + "\nMonth: " + dateTemp.getMonth() + "\nYear: " + (1900 + dateTemp.getYear()));

		} else if (DateValidator.getDateDash(date)) {
			Date dateTemp = new SimpleDateFormat("dd-MM-yyyy").parse(date);
			deals[dealCounter].setDate(
					"Day: " + dateTemp.getDay() + "\nMonth: " + dateTemp.getMonth() + "\nYear: " + (1900  + dateTemp.getYear()));
		} else {
			System.out.println("Invalid date format");
		}

	}

//Creates seller 
	private void createSeller(Scanner scan) {
		System.out.println("Lets start with seller, what is his name...");
		deals[dealCounter].getSeller().setName(scan.next());//set name
		System.out.println("What about his wallet, how much money does he have?");
		deals[dealCounter].getSeller().setMoney(scan.nextDouble());//set money

		do {
			System.out.println("Lets add his phone number");
			deals[dealCounter].getSeller().setTelephone(scan.next());//set phone num
		} while (!belValidator.validate(deals[dealCounter].getSeller().getTelephone()));
		do {
			System.out.println("And email");
			deals[dealCounter].getSeller().setEmail(scan.next());//set email
		} while (!emailValidator.validate(deals[dealCounter].getSeller().getEmail()));

		do {
			System.out.println("Set his Bday in dd//mm//yyyy or dd-mm-yyyy format");
			deals[dealCounter].getSeller().setDateOfBirth(scan.next());//set date od Bday
		} while (!DateValidator.getDateDash(deals[dealCounter].getSeller().getDateOfBirth()) //validation of dates 
				&& !DateValidator.getDateSlash(deals[dealCounter].getSeller().getDateOfBirth()));
	}

// Expends array, used automaticly in addProduct
	private void expandArray() {
		Deal[] temp = new Deal[deals.length * 2 + 1];
		for (int i = 0; i < deals.length; i++) {
			temp[i] = deals[i];
		}
		deals = temp;
	}

//Creates Buyer
	private void createBuyer(Scanner scan) {
		System.out.println("Okay buyer this time, what is his name...");
		deals[dealCounter].getBuyer().setName(scan.next());// set Name
		System.out.println("What about his wallet, how much money does he have?");
		deals[dealCounter].getBuyer().setMoney(scan.nextDouble());// set Money
		do {
			System.out.println("Lets add his phone number");
			deals[dealCounter].getBuyer().setTelephone(scan.next());//set Phone num
		} while (!belValidator.validate(deals[dealCounter].getBuyer().getTelephone()));
		do {
			System.out.println("And email");
			deals[dealCounter].getBuyer().setEmail(scan.next());//set Email
		} while (!emailValidator.validate(deals[dealCounter].getBuyer().getEmail()));
		do {
			System.out.println("Set his Bday in dd//mm//yyyy or dd-mm-yyyy format");
			deals[dealCounter].getBuyer().setDateOfBirth(scan.next());//set date of Bday
		} while (!DateValidator.getDateDash(deals[dealCounter].getBuyer().getDateOfBirth())//validation of dates
				&& !DateValidator.getDateSlash(deals[dealCounter].getBuyer().getDateOfBirth()));
	}

//Method that converts user input to index of deal in  array
	private int chooseDeal(Scanner scan) {
		System.out.println("Choose deal from 1 to " + dealCounter);
		return (scan.nextInt() - 1);
	}

}
