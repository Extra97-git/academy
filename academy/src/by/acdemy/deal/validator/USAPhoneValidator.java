package by.acdemy.deal.validator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class USAPhoneValidator implements Validator{
	private static final String regexp = "\\+1\\d{10}";
    private static final Pattern pattern = Pattern.compile(regexp);

    public boolean validate (String phoneNumber){
        Matcher matcher = pattern.matcher(phoneNumber.trim());
        return matcher.matches();
    }
}
