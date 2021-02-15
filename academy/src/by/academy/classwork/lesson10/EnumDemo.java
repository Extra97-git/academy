package by.academy.classwork.lesson10;

public class EnumDemo {

	public static void main(String[] args) {
		DayOfWeek thisDay = DayOfWeek.SATURDAY;
		
		switch (thisDay) {
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WENSDAY:
			System.out.println("Wensday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case FRIDAY:
			System.out.println("Friday");
			break;
		case SATURDAY:
			System.out.println("Saturday");
			break;
		case SUNDAY:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Not found");
		}
		
		System.out.println(thisDay.getNum());
	}

}
