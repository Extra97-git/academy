package by.academy.classwork.lesson10;

import java.time.LocalDate;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(1970, 1,1);
		date = date.plusYears(30);
		date = date.plusMonths(-7);
		date = date.plusDays(-3);
		
		System.out.println(date);
	}

}
