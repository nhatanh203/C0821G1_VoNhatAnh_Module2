package case_study.service.impl;

import case_study.models.Customer;
import case_study.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImp implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    public static List<Customer> customList = new ArrayList<>();
    ReadWriteFile readWrite = new ReadWriteFile();

    @Override
    public void add() {
        System.out.print("Nhập mã khách hàng : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên của khách hàng : ");
        String name = scanner.nextLine();
        System.out.print("Nhập năm sinh của khách hàng : ");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính của khách hàng : ");
        String gender = scanner.nextLine();
        System.out.print("Nhập số chứng minh nhân dân của khách hàng : ");
        int identityNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số điện thoại của khách hàng : ");
        int phoneNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập email của khách hàng : ");
        String mail = scanner.nextLine();
        System.out.print("Nhập loại của khách hàng : ");
        String typeGuest = scanner.nextLine();
        System.out.print("Nhập địa chỉ của khách hàng : ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, birthDay, gender, identityNum, phoneNum, mail, typeGuest, address);
        customList.add(customer);
        readWrite.writeCustomer(customer);
    }

    @Override
    public void display() {
        for (Customer customer : customList) {
            System.out.println(customer.toString());
        }
        showCustomer();

    }

    @Override
    public void edit() {
        System.out.print("Nhập vào mã khách hàng : ");
        int codeId = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        int size = customList.size();
        for (int i = 0; i < size; i++) {
            if (customList.get(i).getId() == codeId) {
                check = true;
                System.out.print("Nhập id muốn sửa : ");
                int id = Integer.parseInt(scanner.nextLine());
                customList.get(i).setId(id);
                System.out.print("Nhập tên của khách hàng : ");
                String name = scanner.nextLine();
                customList.get(i).setName(name);
                System.out.print("Nhập năm sinh của khách hàng : ");
                int birthDay = Integer.parseInt(scanner.nextLine());
                customList.get(i).setBirthDay(birthDay);
                System.out.print("Nhập giới tính của khách hàng : ");
                String gender = scanner.nextLine();
                customList.get(i).setGender(gender);
                System.out.print("Nhập số chứng minh nhân dân của khách hàng : ");
                int identityNum = Integer.parseInt(scanner.nextLine());
                customList.get(i).setIdentityCard(identityNum);
                System.out.print("Nhập số điện thoại của khách hàng : ");
                int phoneNum = Integer.parseInt(scanner.nextLine());
                customList.get(i).setPhoneNumbers(phoneNum);
                System.out.print("Nhập email của khách hàng : ");
                String mail = scanner.nextLine();
                customList.get(i).setEmail(mail);
                System.out.print("Nhập loại khách hàng : ");
                String typeGuest = scanner.nextLine();
                customList.get(i).setTypeGuest(typeGuest);
                System.out.print("Nhập địa chỉ khách hàng : ");
                String address = scanner.nextLine();
                customList.get(i).setAddress(address);
                break;
            }
        }
        if (!check) {
            System.out.println("Mã khách hàng không tồn tại !!");
        } else {
            display();
        }
    }

    public void showCustomer() {
        List<Customer> custReadList;
        custReadList = readWrite.readCustomer();
        for (int i = 0; i < custReadList.size(); i++) {
            System.out.println(custReadList.get(i));
        }
    }
}
