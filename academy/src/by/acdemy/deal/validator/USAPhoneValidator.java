package by.acdemy.deal.validator;

import java.util.regex.Pattern;


public class USAPhoneValidator implements Validator{
	private static final String regexp = "\\+1\\d{10}";
    private static final Pattern pattern = Pattern.compile(regexp);

    public boolean validate (String phoneNumber){
        return pattern.matcher(phoneNumber).find();
    }
}
