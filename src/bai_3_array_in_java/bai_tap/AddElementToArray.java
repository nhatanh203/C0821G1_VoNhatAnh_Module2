package bai_3_array_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Nhập phần tử cần thêm : ");
        int addElement = scanner.nextInt();

        System.out.println("Vị trí muốn thêm phần tử vào :");
        int indexElement = scanner.nextInt();

        int count = 0;
        int newArr[] = new int[array.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i == indexElement) {
                newArr[i] = addElement;
            } else {
                newArr[i] = array[count];
                count++;
            }
            newArr[indexElement] = addElement;
        }
        System.out.println("Mảng sau khi được thêm : " + Arrays.toString(newArr));
    }
}
