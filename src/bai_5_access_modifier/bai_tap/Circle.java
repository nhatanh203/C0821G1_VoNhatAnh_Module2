package bai_5_access_modifier.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getCircumference() {
        return 3.14 * 2 * radius;
    }

    public static void main(String[] args) {
        Circle newCirle = new Circle(1.0);
        System.out.println(newCirle.getArea());
        System.out.println(newCirle.getCircumference());
    }
}

