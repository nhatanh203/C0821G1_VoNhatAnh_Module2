package review.manage_candidates_company.model;

public class Experience extends Candidate {
    private int yearOfExp;
    private String personalSkill;

    public Experience(){

    }

    public Experience(int id, String firstName, String lastName, int birthDay, String address, int phone, String email, int yearOfExp, String personalSkill) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.yearOfExp = yearOfExp;
        this.personalSkill = personalSkill;
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }

    public String getPersonalSkill() {
        return personalSkill;
    }

    public void setPersonalSkill(String personalSkill) {
        this.personalSkill = personalSkill;
    }

    @Override
    public String toString() {
        return super.toString()+"," + this.yearOfExp +
                "," + this.personalSkill;
    }
}
