package bai_18_string_regex.bai_tap.validate_phone_number;

public class MainPhoneNumber {
    private static ValidatePhoneNumber numExam;

    public static final String[] validNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidNumber = new String[]{"(a8)-(22222222)"};

    public static void main(String[] args) {
        numExam = new ValidatePhoneNumber();
        for (String num : validNumber) {
            boolean isValid = numExam.validate(num);
            System.out.println("Số điện thoại " + num + " có giá trị : " + isValid);
        }
        for (String num : invalidNumber) {
            boolean isValid = numExam.validate(num);
            System.out.println("Số điện thoại " + num + " có giá trị : " + isValid);
        }
    }
}
