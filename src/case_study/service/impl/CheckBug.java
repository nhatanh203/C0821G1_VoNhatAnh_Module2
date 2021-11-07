package case_study.service.impl;

import case_study.service.ICheckBug;

import java.util.Scanner;

public class CheckBug implements ICheckBug {
    Scanner scanner = new Scanner(System.in);

    @Override
    public int checkNum() {
        int id;
        while (true) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.print("Dữ liệu nhập vào có lỗi. Vui lòng nhập lại : ");
            }
        }
        return id;
    }
}
