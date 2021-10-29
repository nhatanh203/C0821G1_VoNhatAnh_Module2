package bai_18_string_regex.bai_tap.validate_name_class;

public class MainNameClass {
    private static ValidateNameClass nameClass;

    public static final String[] validName = new String[]{"C0318G"};
    public static final String[] invalidName = new String[]{"P0323A"};

    public static void main(String[] args) {
        nameClass = new ValidateNameClass();
        for (String name : validName) {
            boolean isValid = nameClass.validate(name);
            System.out.println("Tên lớp " + name + " có giá trị : " + isValid);
        }
        for (String name : invalidName) {
            boolean isValid = nameClass.validate(name);
            System.out.println("Tên lớp " + name + " có giá trị : " + isValid);
        }
    }
}
