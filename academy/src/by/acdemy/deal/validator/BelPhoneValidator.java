package by.acdemy.deal.validator;

import java.util.regex.Pattern;

public class BelPhoneValidator implements Validator {
    private static final String regexp = "\\+375(25|29|33|44)\\d{7}";
    private static final Pattern pattern = Pattern.compile(regexp);

    public boolean validate(String phoneNumber) {
        return pattern.matcher(phoneNumber).find();
    }

}
