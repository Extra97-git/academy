package by.academy.homework.homework4;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class MyDate {
	private Year year = new Year();
	private Month month = new Month();
	private Day day = new Day();

	public MyDate(String date) {
		super();
		if (DateValidator.validate(date)) {
			day.value = Integer.parseInt(date.substring(0, 2));
			month.setMonth(Integer.parseInt(date.substring(3, 5)));
			year.setYear(Integer.parseInt(date.substring(6)));

			if (day.value > daysInMonthRange()) {
				System.out.println("This date is impossible");
			}
		} else {
			System.out.println("This date is impossible");
		}
	}

	private int daysInMonthRange() {
		if (year.leapYearCheck() && month.value == 2) {
			return 29;
		}
		return 28 + (month.value + month.value / 8) % 2 + 2 % month.value + 1 / month.value * 2;
	}

	// Велосипед, котoрый не учитывает переход с Юлианского календаря на Григорианский
	//Оно работает с большего, но из-за перехода на григорианский календарь в 16ом веке (которую я не отобразил)
	//Есть небольшая погрешнеость в пару дней.
	public int daysInDate() {
		int totalDaysInMonth = 0;
		switch (month.value) {
		case 1:// 31
			totalDaysInMonth = 0;
			break;
		case 2:// 28
			totalDaysInMonth = 31;
			break;
		case 3:// 31
			totalDaysInMonth = 59;
			break;
		case 4:// 30
			totalDaysInMonth = 90;
			break;
		case 5:// 31
			totalDaysInMonth = 120;
			break;
		case 6:// 30
			totalDaysInMonth = 151;
			break;
		case 7:// 31
			totalDaysInMonth = 181;
			break;
		case 8:// 31
			totalDaysInMonth = 212;
			break;
		case 9:// 30
			totalDaysInMonth = 243;
			break;
		case 10:// 31
			totalDaysInMonth = 273;
			break;
		case 11:// 30
			totalDaysInMonth = 304;
			break;
		case 12:// 31
			totalDaysInMonth = 334;
			break;
		default:
			break;
		}
		if (year.leapYearCheck() && month.value > 2) {
			totalDaysInMonth++;
		}
		return totalDaysInMonth + (year.value - 1) * 365 + (year.value - 1) / 4 - (year.value - 1) / 100
				+ (year.value - 1) / 400 + day.value;
	}

	// Метод использующий велосипед
	public int daysBetweenDatesBad(MyDate date2) {
		return Math.abs(daysInDate() - date2.daysInDate());

	}
	
	//Метод без велосипеда
	public long daysBetweenDatesGood(MyDate date2) {
		return Math.abs(ChronoUnit.DAYS.between(LocalDate.of(year.value, month.value, day.value),
				LocalDate.of(date2.year.value, date2.month.value, date2.day.value)));
	}
	
	public DaysOFWeek getDayOfWeek() {
		return DaysOFWeek.getByOrdinal(LocalDate.of(year.value, month.value, day.value).getDayOfWeek().ordinal());
	}

	public Year getYear() {
		return year;
	}

	public Month getMonth() {
		return month;
	}

	public Day getDay() {
		return day;
	}

	class Year {
		private int value;

		private int getYear() {
			return value;
		}

		private void setYear(int year) {
			this.value = year;
		}

		private boolean leapYearCheck() {
			return (value % 4 == 0 && value % 100 != 0) || value % 400 == 0;
		}
	}

	class Month {
		private int value;

		public int getMonth() {
			return value;
		}

		public void setMonth(int month) {
			this.value = month;
		}
	}

	class Day {
		private int value;

		public int getDay() {
			return value;
		}

		public void setDay(int day) {
			this.value = day;
		}
	}

}
