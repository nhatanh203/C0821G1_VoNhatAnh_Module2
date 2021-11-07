package case_study.models;

public abstract class Person {
    private int id;
    private String name;
    private String birthDay;
    private String gender;
    private int identityCard;
    private int phoneNumbers;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String birthDay, String gender, int identityCard, int phoneNumbers, String email) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(int phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + birthDay + "," + gender + "," + identityCard + "," + phoneNumbers + "," + email;
    }
}
