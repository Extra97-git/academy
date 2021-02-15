import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import by.acdemy.deal.validator.DateValidator;

public class Test {
 Scanner scan = new Scanner(System.in);
	private String setDealDate() throws ParseException {
		String str = null;
		do {
			System.out.println("Set his Bday in dd//mm//yyyy or dd-mm-yyyy format");
			str = scan.next();
			System.out.println(str);
		} while (!DateValidator.getDateDash(str) && !DateValidator.getDateSlash(str));
		return str;
			
	}

	public static void main(String[] args) throws ParseException {
		Test test = new Test();
 
		System.out.println(test.setDealDate());
	}

}
