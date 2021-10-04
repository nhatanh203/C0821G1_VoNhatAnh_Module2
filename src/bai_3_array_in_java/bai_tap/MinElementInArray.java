package bai_3_array_in_java.bai_tap;

import java.util.Scanner;

public class MinElementInArray {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            num = scanner.nextInt();
        } while (num <= 0);
        int array[] = new int[num];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < num; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        int index = minElement(array);
        System.out.println("Phần tử nhỏ nhất trong mảng là : " + array[index]);
    }

    public static int minElement(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;


    }
}
