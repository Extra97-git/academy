package by.acdemy.deal.validator;

import java.util.regex.Pattern;

public class DateValidator {
	private static final Pattern paternSlash = Pattern.compile("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/([0-9]{4})");
	private static final Pattern paternDash = Pattern.compile("(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-([0-9]{4})");


	public static boolean getDateSlash(String str) {
		return paternSlash.matcher(str).find();
	}

	public static  boolean getDateDash(String str) {
		return paternDash.matcher(str).find();
	}
}
