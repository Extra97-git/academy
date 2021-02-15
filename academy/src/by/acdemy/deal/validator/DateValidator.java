package by.acdemy.deal.validator;

import java.util.regex.Pattern;

public class DateValidator {
	private static final Pattern paternSlash = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");
	private static final Pattern paternDash = Pattern.compile("([0-9]{2})-([0-9]{2})-([0-9]{4})");


	public static boolean getDateSlash(String str) {
		if (paternSlash.matcher(str).find()) {
			return true;
		}
		return false;
	}

	public static  boolean getDateDash(String str) {
		if (paternDash.matcher(str).find()) {
			return true;
		}
		return false;
	}
}
