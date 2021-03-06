package by.academy.homework.homework4;

import java.util.regex.Pattern;

public class DateValidator {
	  private static final Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[-]" +
	            "(0[1-9]|1[0-2])[-](1[0-9]{3}|20[01][0-9]|202[01])");

	    public final static boolean validate(String strDate) {
	        return pattern.matcher(strDate.trim()).matches();
	    }
}
