package case_study.models;

public class Employee extends Person {
    private String level;
    private String location;
    private int wage;

    public Employee(int id, int birthDay, String gender, int identityNum, int phoneNum, String mail, String level, String location, int wage) {
    }

    public Employee(int id, String name, int birthDay, String gender, int identityCard, int phoneNumbers, String email, String level, String location, int wage) {
        super(id, name, birthDay, gender, identityCard, phoneNumbers, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return  super.toString() + "," +  this.level + "," + this.location + "," + this.wage ;
    }
}
