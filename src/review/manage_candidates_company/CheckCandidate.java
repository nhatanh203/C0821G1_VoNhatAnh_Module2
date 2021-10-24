package review.manage_candidates_company;

import java.util.Scanner;

public class CheckCandidate {
    static Scanner scanner = new Scanner(System.in);

    public static int checkYearDate() {
        System.out.print("Nhập năm sinh ứng viên : ");
        int yearDate;
        while (true) {
            try {
                yearDate = Integer.parseInt(scanner.nextLine());
                if (yearDate < 1900 || yearDate > 2021) {
                    System.out.println("Năm sinh không hợp lệ !!!");
                    System.out.print("Vui lòng nhập lại : ");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào không phải là số. Vui lòng nhập lại : ");
            }
        }
        return yearDate;
    }

    static public int CheckPhone() {
        String input = null;
        boolean check = true;
        while (check) {
            System.out.println("Nhập vào số điện thoại ứng viên : ");
            input = scanner.nextLine();
            if (input.length() < 10) {
                System.out.println("Số điện thoại không hợp lệ ! ");
            } else {
                check = false;
            }
        }
        int checkPhone = Integer.parseInt(input);
        return checkPhone;
    }

    static public int checkYearOfExp() {
        int yearOfExp = 0;
        boolean check = true;
        while (check) {
            System.out.println("Nhập vào số năm kinh nghiệm : ");
            yearOfExp = Integer.parseInt(scanner.nextLine());
            if (yearOfExp < 0 || yearOfExp > 100) {
                System.out.println("Không hợp lệ ! ");
            } else {
                check = false;
            }
        }
        return yearOfExp;
    }
}
