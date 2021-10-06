package bai_4_class_object_in_java.bai_tap.quadratic_equation;

import java.util.Scanner;

//Khai báo class
public class QuadraticEquation {
    private double a, b, c;

//    constructor không tham số
    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //    Tính delta của phương trình
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
//Tính x1 với công thức : x1 = (-b + căn delta) / 2a
//Sử dụng sqrt để tính căn bậc 2

    public double getRoot1() {
        if (this.getDiscriminant() < 0) return 0;
        return ((-b + Math.sqrt(this.getDiscriminant())) / (2 * a));
    }

    //Tính x2 với công thức : x1 = (-b - căn delta) / 2a
    public double getRoot2() {
        if (this.getDiscriminant() < 0) return 0;
        return ((-b - Math.sqrt(this.getDiscriminant())) / (2 * a));
    }

    //    Tạo object
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Enter a,b,c: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() < 0) System.out.println("The equation has no roots");
        else if (equation.getDiscriminant() == 0)
            System.out.println("The equation has one root: " + equation.getRoot1());
        else {
            System.out.println("The equation has two roots: ");
            System.out.println("Delta is: " + equation.getDiscriminant());
            System.out.println("Root1 is: " + equation.getRoot1());
            System.out.println("Root2 is: " + equation.getRoot2());
        }
    }
}
