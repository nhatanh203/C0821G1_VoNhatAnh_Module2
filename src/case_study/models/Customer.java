package case_study.models;

public class Customer extends Person{
    private String typeGuest;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String birthDay, String gender, int identityCard, int phoneNumbers, String email, String typeGuest, String address) {
        super(id, name, birthDay, gender, identityCard, phoneNumbers, email);
        this.typeGuest = typeGuest;
        this.address = address;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  super.toString() + "," + typeGuest + "," + address;
    }
}
