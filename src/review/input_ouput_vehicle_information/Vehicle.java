package review.input_ouput_vehicle_information;

public class Vehicle {
    //    Mã xe, Dung tích của xe
    private int inforVehicle, capacityVehicle;
    //    Trị giá của xe
    private double value;
    //Chủ xe, Mô tả
    private String owner, note;

    public Vehicle() {

    }

    public Vehicle(int inforVehicle, int capacityVehicle, double value, String owner, String note) {
        this.inforVehicle = inforVehicle;
        this.capacityVehicle = capacityVehicle;
        this.value = value;
        this.owner = owner;
        this.note = note;
    }

    public int getInforVehicle() {
        return inforVehicle;
    }

    public void setInforVehicle(int inforVehicle) {
        this.inforVehicle = inforVehicle;
    }

    public int getCapacityVehicle() {
        return capacityVehicle;
    }

    public void setCapacityVehicle(int capacityVehicle) {
        this.capacityVehicle = capacityVehicle;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    //Tính thuế của xe
    public double taxVehicle() {
        double tax;
        if (inforVehicle < 100) tax = value * 0.1;
        else if (inforVehicle >= 100 && inforVehicle <= 200) tax = value * 0.3;
        else tax = value * 0.5;
        return tax;
    }

    @Override
    public String toString() {
        return inforVehicle + "-" + owner + "-" + capacityVehicle + "-" + value + "-" + note;
    }

    //Khởi tạo phương thức outputTax để in ra thuế
    void outputTax() {
        System.out.println("Mã xe : " + inforVehicle);
        System.out.println("Tên chủ xe : " + owner);
        System.out.println("Dung tích xe : " + capacityVehicle);
        System.out.println("Trị giá : " + value);
        System.out.println("Mô tả : " + note);
        System.out.println("Thuế : " + taxVehicle());
    }
}
