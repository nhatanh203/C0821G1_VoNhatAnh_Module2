package review.manage_candidates_company.model;

public class Fresher extends Candidate {
    private String graduationTime;
    private String graduationRank;
    private String nameOfSchool;

    public Fresher() {
    }

    public Fresher(int id, String firstName, String lastName, int birthDay, String address, int phone, String email, String graduationTime, String graduationRank, String nameOfSchool) {
        super(id, firstName, lastName, birthDay, address, phone, email);
        this.graduationTime = graduationTime;
        this.graduationRank = graduationRank;
        this.nameOfSchool = nameOfSchool;
    }

    public String getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(String graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    @Override
    public String toString() {
        return super.toString()+"," + this.graduationTime +
                "," + this.graduationRank +"," + this.nameOfSchool;
    }
}
