package bai_15_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập độ dài cạnh 1 của tam giác : ");
            int edge1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập độ dài cạnh 2 của tam giác : ");
            int edge2 = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập độ dài cạnh 3 của tam giác : ");
            int edge3 = Integer.parseInt(scanner.nextLine());
            if (edge1 <= 0 || edge2 <= 0 || edge1 <= 0) {
                throw new IllegalTriangleException("Độ dài cạnh tam giác không thể nhỏ hơn hoặc bằng 0 ! ");
            }
            if ((edge1 + edge2) > edge3 || (edge1 + edge3) > edge2 || (edge3 + edge2) > edge1) {
                throw new IllegalTriangleException("Các cạnh của bạn nhập vào không phải là 1 tam gíac !!");
            }
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}
