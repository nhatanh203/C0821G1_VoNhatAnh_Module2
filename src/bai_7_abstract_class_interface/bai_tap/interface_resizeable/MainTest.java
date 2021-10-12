package bai_7_abstract_class_interface.bai_tap.interface_resizeable;

public class MainTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 100);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "blue", false);
        shapes[1] = new Rectangle(x, x, "red", true);
        shapes[2] = new Square(x, "yellow", true);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
