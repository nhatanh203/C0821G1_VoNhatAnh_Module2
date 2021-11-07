package case_study.service.impl;

import case_study.service.ICheckInput;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckInputImp implements ICheckInput {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public String checkIdService() {
        String idService;
        while (true) {
            try {
                idService = scanner.nextLine();
                if(!Pattern.matches("^[A-Z&&[VHR]]{1}[0-9]+$", idService)) {
                    System.out.print("Mã dịch vụ không hợp lệ. Vui lòng nhập lại : ");
                    continue;
                }
                break;
            }catch (Exception e) {
                System.out.print("Dữ liệu nhập vào có lỗi. Vui lòng nhập lại : ");
            }
        }
        return idService;

    }

    @Override
    public String checkNameService() {
        String nameService;
        while (true) {
            try {
                nameService = scanner.nextLine();
                if(!Pattern.matches("^[A-Z]{1}[a-z]+$", nameService)) {
                    System.out.print("Tên dịch vụ không hợp lệ. Vui lòng nhập lại : ");
                    continue;
                }
                break;
            }catch (Exception e) {
                System.out.print("Dữ liệu nhập vào có lỗi. Vui lòng nhập lại : ");
            }
        }
        return nameService;
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
    public String checkRentalType() {
        String rentalType;
        while (true) {
            try {
                rentalType = scanner.nextLine();
                if(!Pattern.matches("^[A-Z]{1}[a-z]+$", rentalType)) {
                    System.out.print("Kiểu thuê không hợp lệ. Vui lòng nhập lại : ");
                    continue;
                }
                break;
            }catch (Exception e) {
                System.out.print("Dữ liệu nhập vào có lỗi. Vui lòng nhập lại : ");
            }
        }
        return rentalType;
    }

    @Override
    public String checkRoomStandard() {
        String roomStandard;
        while (true) {
            try {
                roomStandard = scanner.nextLine();
                if(!Pattern.matches("^[A-Z]{1}[a-z]+$", roomStandard)) {
                    System.out.print("Tiêu chuẩn phòng không lệ. Vui lòng nhập lại : ");
                    continue;
                }
                break;
            }catch (Exception e) {
                System.out.print("Dữ liệu nhập vào có lỗi. Vui lòng nhập lại : ");
            }
        }
        return roomStandard;
    }

    @Override
    public String checkBirthday() {
        String birthDay;
        while (true) {
            try {
                birthDay = scanner.nextLine();
                if(!Pattern.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$", birthDay)) {
                    System.out.print("Nhập ngày tháng năm theo định dạng (dd/mm/YYYY) : ");
                    continue;
                }
                break;
            }catch (Exception e) {
                System.out.print("Dữ liệu nhập vào có lỗi. Vui lòng nhập lại (dd/mm/YYYY) : ");
            }
        }
        return birthDay;
    }
}
