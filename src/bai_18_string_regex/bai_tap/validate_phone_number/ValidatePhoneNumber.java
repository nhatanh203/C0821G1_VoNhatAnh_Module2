package bai_18_string_regex.bai_tap.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String VALIDATE_PHONE_NUM = "^\\([0-9]{2}\\)[.-]\\([0][0-9]{9}\\)$";

    public ValidatePhoneNumber() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(VALIDATE_PHONE_NUM);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

