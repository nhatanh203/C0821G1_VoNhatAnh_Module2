package bai_18_string_regex.bai_tap.validate_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static final String VALIDATE_NAME_CLASS = "^[CAP][0-9]{4}[GHIKLM]$";

    public ValidateNameClass() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(VALIDATE_NAME_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
