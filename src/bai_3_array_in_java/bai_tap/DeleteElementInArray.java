package bai_3_array_in_java.bai_tap;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhập phần tử cần xoá : ");
        int deleteElement = scanner.nextInt();

        int newArray = array.length;

        for (int x = 0; x < array.length; x++) {
            if (array[x] == deleteElement) {
                System.out.println(deleteElement + " vị trí ở " + x);
                break;
            }
        }
        for (int i = 0; i < newArray; i++) {
            while (array[i] == deleteElement) {
                if (i == newArray - 1) {
                    newArray--;
                    break;
                } else {
                    for (int j = i; j < newArray - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    newArray--;
                }
            }
        }
        for (int i = 0; i < newArray; i++) {
            System.out.printf("\na (%d] = %d", i, array[i]);
        }
    }
}