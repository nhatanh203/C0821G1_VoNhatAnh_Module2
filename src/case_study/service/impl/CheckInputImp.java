package case_study.service.impl;

import case_study.service.ICheckInput;

import java.util.Scanner;

public class CheckInputImp implements ICheckInput {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void checkIdService() {

    }

    @Override
    public void checkNameService() {
//        String regex = null;
//        final String VALIDATE_NAME = "^[A-Z].*";
//        System.out.print("Nhập tên dịch vụ : ");
//        String nameService = scanner.nextLine();
//        Pattern pattern = Pattern.compile(VALIDATE_NAME);
//        Matcher matcher = pattern.matcher(regex);
    }

    @Override
    public int checkUsebleArea() {
        System.out.print("Nhập diện tích sử dụng : ");
        int usebleArea;
        while (true) {
            try {
                usebleArea = Integer.parseInt(scanner.nextLine());
                if (usebleArea < 30) {
                    System.out.println("Diện tích sử dụng không hợp lệ !!!");
                    System.out.print("Vui lòng nhập lại : ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào không phải là số. Vui lòng nhập lại : ");
            }
        }
        return usebleArea;
    }

    @Override
    public int checkPoolArea() {
        System.out.print("Nhập diện tích bể bơi : ");
        int poolArea;
        while (true) {
            try {
                poolArea = Integer.parseInt(scanner.nextLine());
                if (poolArea < 30) {
                    System.out.println("Diện tích bể bơi không hợp lệ !!!");
                    System.out.print("Vui lòng nhập lại : ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào không phải là số. Vui lòng nhập lại : ");
            }
        }
        return poolArea;
    }

    @Override
    public int checkRentCost() {
        System.out.print("Nhập chi phí thuê : ");
        int rentCost;
        while (true) {
            try {
                rentCost = Integer.parseInt(scanner.nextLine());
                if (rentCost < 0) {
                    System.out.println("Chi phí thuê không hợp lệ !!!");
                    System.out.print("Vui lòng nhập lại : ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào không phải là số. Vui lòng nhập lại : ");
            }
        }
        return rentCost;
    }

    @Override
    public int checkMaxOfPeople() {
        System.out.print("Nhập số lượng người tối đa : ");
        int maxOfPeople;
        while (true) {
            try {
                maxOfPeople = Integer.parseInt(scanner.nextLine());
                if (maxOfPeople < 0 || maxOfPeople > 20) {
                    System.out.println("Số lượng người không hợp lệ !!!");
                    System.out.print("Vui lòng nhập lại : ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào không phải là số. Vui lòng nhập lại : ");
            }
        }
        return maxOfPeople;

    }

    @Override
    public int checkNumbersOfFloors() {
        System.out.print("Nhập số tầng : ");
        int numbersOfFloors;
        while (true) {
            try {
                numbersOfFloors = Integer.parseInt(scanner.nextLine());
                if (numbersOfFloors < 0) {
                    System.out.println("Số tầng không hợp lệ !!!");
                    System.out.print("Vui lòng nhập lại : ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào không phải là số. Vui lòng nhập lại : ");
            }
        }
        return numbersOfFloors;
    }

    @Override
    public void checkRentalType() {

    }

    @Override
    public void checkRoomStandard() {

    }

    @Override
    public void checkBirthday() {

    }
}
