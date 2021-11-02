package bai_19_design_patterns.bai_tap.apply_factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape a1 = shapeFactory.getShape("nothing");
        a1.draw();
        Shape a2 = shapeFactory.getShape("draw");
        a2.draw();
        Shape a3 = shapeFactory.getShape("draw!!!");
        a3.draw();
    }
}
