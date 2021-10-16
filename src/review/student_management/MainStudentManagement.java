package review.student_management;

import java.util.Scanner;

public class MainStudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement student = new StudentManagement();
        int switchCs = 0;
        do {
            System.out.println("-----Hệ thống quản lí sinh viên-----");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên ");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Kiểm tra sinh viên có trong danh sách hay không ");
            System.out.println("6. Sắp xếp sinh viên theo điểm số từ nhỏ đến lớn ");
            System.out.println("0. Kết thúc chương trình !!");
            switchCs = Integer.parseInt(scanner.nextLine());
            switch (switchCs) {
                case 1:
                    student.displayListStudent();
                    break;
                case 2:
                    student.addStudent();
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên muốn sửa thông tin :");
                    int index1 = Integer.parseInt(scanner.nextLine());
                    student.editStudent(index1);
                    break;
                case 4:
                    System.out.println("Nhập vị trí index sinh viên cần xóa : ");
                    int index = Integer.parseInt(scanner.nextLine());
                    student.deleteStudent(index);
                    break;
                case 5:
                    student.checkStudent();
                    break;
                case 6:
                    ((StudentManagement) student).sortStudent();
                    break;
                case 0:
                    System.out.println("Cảm ơn vì đã sử dụng chương trình !!!");
                    break;
            }
        } while (switchCs != 0);
    }
}