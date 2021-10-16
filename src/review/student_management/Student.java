package review.student_management;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private int studentCode;
    private String name;
    private String address;
    private float point;

    public Student() {

    }

    public Student(int studentCode, String name, String address, float point) {
        this.studentCode = studentCode;
        this.name = name;
        this.address = address;
        this.point = point;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "StudentManagement{" +
                "studentCode=" + studentCode +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getPoint() > student2.getPoint()) {
            return 1;
        }
        return -1;
    }
}
