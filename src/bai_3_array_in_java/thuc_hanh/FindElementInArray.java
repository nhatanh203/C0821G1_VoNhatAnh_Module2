package bai_3_array_in_java.thuc_hanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentsOfC08 = {"Anh", "Vy", "Bảo", "Dự", "Tâm", "Kiên", "Phiên", "Duy", "Hoàng", "Đông"};
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < studentsOfC08.length; i++) {
            if (studentsOfC08[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
