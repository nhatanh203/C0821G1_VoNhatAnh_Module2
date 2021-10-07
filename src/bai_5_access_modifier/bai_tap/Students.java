package bai_5_access_modifier.bai_tap;

public class Students {
    private String name = "John";
    private String classes = "C02";

    public Students() {
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setClasses(String classes) {
        this.classes = classes;
        return classes;
    }

    public static void main(String[] args) {
        Students std = new Students();
        System.out.println(std.setName("Nhat Anh"));
        System.out.println(std.setClasses("C0821G1"));
    }
}
