package bai_6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;
    private double volume;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeght(int height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double volumeCircle() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "heght=" + height +
                ", volume=" + volume +
                '}';
    }

    public static void main(String[] args) {
        Circle cylinder = new Cylinder(3.2, "red", 12);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + ((Cylinder) cylinder).volumeCircle());

    }
}
