package by.acdemy.deal.validator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class BelPhoneValidator implements Validator {
    public static final String regexp = "\\+375(25|29|33|44)\\d{7}";
    private static final Pattern pattern = Pattern.compile(regexp);

    public boolean validate(String phoneNumber) {
        Matcher matcher = pattern.matcher(phoneNumber.trim());
        return matcher.matches();
    }

}
