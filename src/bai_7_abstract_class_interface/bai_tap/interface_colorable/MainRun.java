package bai_7_abstract_class_interface.bai_tap.interface_colorable;

public class MainRun {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shape[i] = getRandomShape();
        }
        Shape.printShape(shape);
        for (Shape x : shape) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }
    }
    static Shape getRandomShape() {
        int random = (int) (Math.round(Math.random() * 4));
        switch (random) {
            case 0:
                return new Square(15);
            case 1:
                return new Rectangle(15, 30);
            default:
                return new Circle(20);
        }
    }
}
