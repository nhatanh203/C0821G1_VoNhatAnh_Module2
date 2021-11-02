package bai_19_design_patterns.bai_tap.apply_factory_method;

public class ShapeFactory {
    public Shape getShape(String type){
        if ("draw".equals(type)) {
            return new Circle();
        } else if ("nothing".equals(type)){
            return new Rectangle();
        }else {
            return new Square();
        }
    }
}
