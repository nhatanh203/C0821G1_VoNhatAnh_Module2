package bai_1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class chuyendoi_tiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập trị giá USD : ");
        int usd = scanner.nextInt();
        System.out.println("VND : " + (usd * 23000));
    }
}
