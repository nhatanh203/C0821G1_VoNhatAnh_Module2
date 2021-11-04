package case_study.controllers;

import case_study.service.*;
import case_study.service.impl.CustomerServiceImp;
import case_study.service.impl.EmployeeServiceImp;
import case_study.service.impl.FacilityServiceImp;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService emplSer = new EmployeeServiceImp();
        CustomerService custSer = new CustomerServiceImp();
        FacilityService faciSer = new FacilityServiceImp();
        int switchCs = 6;
        do {
            System.out.println("---Welcome to FURAMA RESORT---");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Choose service here, please : ");
            switchCs = Integer.parseInt(scanner.nextLine());
            switch (switchCs) {
                case 1:
                    do {
                        System.out.println("---EMPLOYEE MANAGEMENT---");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        System.out.print("Choose service here, please : ");
                        switchCs = Integer.parseInt(scanner.nextLine());
                        switch (switchCs) {
                            case 1:
                                emplSer.display();
                                break;
                            case 2:
                                emplSer.add();
                                break;
                            case 3:
                                emplSer.edit();
                                break;
                        }
                    } while (switchCs != 4);
                    break;
                case 2:
                    do {
                        System.out.println("---CUSTOMER MANAGEMENT---");
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");
                        System.out.print("Choose service here, please : ");
                        switchCs = Integer.parseInt(scanner.nextLine());
                        switch (switchCs) {
                            case 1:
                                custSer.display();
                                break;
                            case 2:
                                custSer.add();
                                break;
                            case 3:
                                custSer.edit();
                                break;
                        }
                    } while (switchCs != 4);
                    break;
                case 3:
                    int switchCs2 = 6;
                    do {
                        System.out.println("---FACILITY MANAGEMENT---");
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        System.out.print("Choose service here, please : ");
                        switchCs = Integer.parseInt(scanner.nextLine());
                        switch (switchCs) {
                            case 1: faciSer.display();
                                break;
                            case 2:
                                do {
                                    System.out.println("1. Add new Villa ");
                                    System.out.println("2. Add new House ");
                                    System.out.println("3. Add new Room ");
                                    System.out.println("4. Return main menu");
                                    System.out.print("Choose service here, please : ");
                                    switchCs2 = Integer.parseInt(scanner.nextLine());
                                    switch (switchCs2) {
                                        case 1: faciSer.addVilla();
                                            break;
                                        case 2: faciSer.addHouse();
                                            break;
                                        case 3: faciSer.addRoom();
                                            break;
                                    }
                                } while (switchCs2 != 4);
                                break;
                            case 3:
                                break;
                        }
                    } while (switchCs != 4);
                    break;
                case 4:
                    int switchCs1 = 6;
                    do {
                        System.out.println("---BOOKING MANAGEMENT---");
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Creat new constracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        System.out.print("Choose service here, please : ");
                        switchCs1 = Integer.parseInt(scanner.nextLine());
                        switch (switchCs1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                    } while (switchCs1 != 6);
                    break;
                case 5:
                    do {
                        System.out.println("---PROMOTION MANAGEMENT---");
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        System.out.print("Choose service here, please : ");
                        switchCs = Integer.parseInt(scanner.nextLine());
                        switch (switchCs) {
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                    } while (switchCs != 3);
                    break;
                case 6:
                    System.out.println("Thank you for using the service !!!");
                    break;
            }

        } while (switchCs != 6);
    }
}
