package case_study.service.impl;

import case_study.models.Employee;
import case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImp implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    public static List<Employee> empList = new ArrayList<>();
    ReadWriteFile readWrite = new ReadWriteFile();

    @Override
    public void add() {
        System.out.print("Nhập id của nhân viên : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên của nhân viên : ");
        String name = scanner.nextLine();
        System.out.print("Nhập năm sinh của nhân viên : ");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính của nhân viên : ");
        String gender = scanner.nextLine();
        System.out.print("Nhập số chứng minh nhân dân của nhân viên : ");
        int identityNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số điện thoại của nhân viên : ");
        int phoneNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập email của nhân viên : ");
        String mail = scanner.nextLine();
        System.out.print("Nhập trình độ của nhân viên : ");
        String level = scanner.nextLine();
        System.out.print("Nhập vị trí của nhân viên : ");
        String location = scanner.nextLine();
        System.out.print("Nhập lương của nhân viên : ");
        int wage = Integer.parseInt(scanner.nextLine());
        Employee emplloyee = new Employee(id, name, birthDay, gender, identityNum, phoneNum, mail, level, location, wage);
        empList.add(emplloyee);
        readWrite.writeEmployee(emplloyee);
    }

    @Override
    public void display() {
        for (Employee Employee : empList) {
            System.out.println(Employee.toString());
        }
        showEmployee();
    }

    @Override
    public void edit() {
        System.out.print("Nhập vào mã nhân viên : ");
        int codeId = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        int size = empList.size();
        for (int i = 0; i < size; i++) {
            if (empList.get(i).getId() == codeId) {
                check = true;
                System.out.print("Nhập id muốn sửa : ");
                int id = Integer.parseInt(scanner.nextLine());
                empList.get(i).setId(id);
                System.out.print("Nhập tên của nhân viên : ");
                String name = scanner.nextLine();
                empList.get(i).setName(name);
                System.out.print("Nhập năm sinh của nhân viên : ");
                int birthDay = Integer.parseInt(scanner.nextLine());
                empList.get(i).setBirthDay(birthDay);
                System.out.print("Nhập giới tính của nhân viên : ");
                String gender = scanner.nextLine();
                empList.get(i).setGender(gender);
                System.out.print("Nhập số chứng minh nhân dân của nhân viên : ");
                int identityNum = Integer.parseInt(scanner.nextLine());
                empList.get(i).setIdentityCard(identityNum);
                System.out.print("Nhập số điện thoại của nhân viên : ");
                int phoneNum = Integer.parseInt(scanner.nextLine());
                empList.get(i).setPhoneNumbers(phoneNum);
                System.out.print("Nhập email của nhân viên : ");
                String mail = scanner.nextLine();
                empList.get(i).setEmail(mail);
                System.out.print("Nhập trình độ của nhân viên : ");
                String level = scanner.nextLine();
                empList.get(i).setLevel(level);
                System.out.print("Nhập vị trí của nhân viên : ");
                String location = scanner.nextLine();
                empList.get(i).setLocation(location);
                System.out.print("Nhập lương của nhân viên : ");
                int wage = Integer.parseInt(scanner.nextLine());
                empList.get(i).setWage(wage);
                break;
            }
        }
        if (!check) {
            System.out.println("Mã nhân viên không tồn tại !!");
        } else {
            display();
        }
    }

    public void showEmployee() {
        List<Employee> emplpyReadList;
        emplpyReadList = readWrite.readEmployee();
        for (int i = 0; i < emplpyReadList.size(); i++) {
            System.out.println(emplpyReadList.get(i));
        }
    }
}
