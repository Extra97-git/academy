import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import by.acdemy.deal.validator.DateValidator;

public class Test {

	private String setDealDate(String date) throws ParseException {
		System.out.println("Add date in dd/mm/yyyy or dd-mm-yyyy format");
		if(DateValidator.getDateSlash(date)) {
			Date dateTemp = new SimpleDateFormat("dd/MM/yyyy").parse("19/02/1998");
			return "Day: " + dateTemp.getDay() + "\nMonth: " + dateTemp.getMonth() + "\nYear: " + dateTemp.getYear();
			
		} else if(DateValidator.getDateDash(date)) {
			Date dateTemp = new SimpleDateFormat("dd-MM-yyyy").parse(date);
			return "Day: " + dateTemp.getDay() + "\nMonth: " + dateTemp.getMonth() + "\nYear: " + dateTemp.getYear();
		} else {
			System.out.println("Invalid date format");
			return null;
		}
			
	}

	public static void main(String[] args) throws ParseException {
		Test test = new Test();
 
		System.out.println(test.setDealDate("19/02/1998"));
	}

}
