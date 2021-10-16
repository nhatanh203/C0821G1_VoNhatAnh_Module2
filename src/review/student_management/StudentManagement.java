package review.student_management;

import java.util.*;

public class StudentManagement {

    Scanner scanner = new Scanner(System.in);
    private static List<Student> list = new ArrayList<>();

    static {
        list.add(new Student(1, "Vo Nhat Anh", "Quang Binh", 10));
        list.add(new Student(2, "Nhat Anh vo", "Sai Gon", 9));
        list.add(new Student(3, "Vo Anh Nhat", "Ha Noi", 7));
    }

    //    1.Phương thức thêm sinh viên
    public void addStudent() {
        System.out.println("Nhập mã sinh viên : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ và tên sinh viên :");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên : ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm sinh viên : ");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, address, point);
        System.out.println("Nhập vị trí index : ");
        int index = Integer.parseInt(scanner.nextLine());
        list.add(index, student);
    }

    //    2.Phương thức hiển thị danh sách sinh viên
    public void displayListStudent() {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    //    3.Phương thức xoá sinh viên
    public void deleteStudent(int index) {
        list.remove(index);
    }

    //    4.Phương thức check xem sinh viên có trong danh sách hay không, dựa trên mã sinh viên
    public void checkStudent() {
        System.out.println("Nhập mã sinh viên");
        int codeStudent = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (codeStudent == list.get(i).getStudentCode()) {
                check = true;
                System.out.println("Sinh viên đã có trong danh sách");
                System.out.println(list.get(i).toString());
                break;
            }
        }
        if (!check) {
            System.out.println("Sinh viên không có trong danh sách ");
        }
    }

    //    5.Phương thức sắp xếp sinh viên
    public void sortStudent() {
        Collections.sort(list, new Student());
        displayListStudent();
    }

    //    6.Phương thức chỉnh sửa thông tin sinh viên trong danh sách
    public void editStudent(int index) {
        boolean check = false;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getStudentCode() == index) {
                check = true;
                System.out.println("Nhập tên muốn sửa");
                String name = scanner.nextLine();
                list.get(i).setName(name);
                System.out.println("Nhập địa chỉ muốn sửa");
                String address = scanner.nextLine();
                list.get(i).setAddress(address);
                System.out.println("Nhập điểm");
                int point = Integer.parseInt(scanner.nextLine());
                list.get(i).setPoint(point);
                break;
            }
        }
        if (!check) {
            System.out.println("Mã sinh viên không tồn tại");
        } else {
            displayListStudent();
        }
    }
}




