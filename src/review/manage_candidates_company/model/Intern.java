package review.manage_candidates_company.model;

public class Intern extends Candidate {
    private String majors;
    private int studyingYears;
    private String nameOfSchool;

    public Intern() {
    }

    public Intern(int id, String firstName, String lastName, int birthDay, String address, int phone, String email, String majors, int studyingYears, String nameOfSchool) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.majors = majors;
        this.studyingYears = studyingYears;
        this.nameOfSchool = nameOfSchool;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getStudyingYears() {
        return studyingYears;
    }

    public void setStudyingYears(int studyingYears) {
        this.studyingYears = studyingYears;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    @Override
    public String toString() {
        return super.toString()+"," + this.majors +"," + this.studyingYears +"," + this.nameOfSchool;
    }
}
