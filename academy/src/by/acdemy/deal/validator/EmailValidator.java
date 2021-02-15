package by.acdemy.deal.validator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator implements Validator {
	public static final String regexp = "[a-zA-Z0-9]+[._a-zA-Z0-9!#$%&'*+-/=?^_`{|}~]*[a-zA-Z]*@[a-zA-Z0-9]{2,8}.[a-zA-Z.]{2,6}";
    private static final Pattern pattern = Pattern.compile(regexp);

    public boolean validate(String email) {
        Matcher matcher = pattern.matcher(email.trim());
        return matcher.matches();
    }

}
