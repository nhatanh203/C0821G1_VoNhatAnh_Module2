package bai_3_array_in_java.bai_tap;

import java.util.Scanner;

public class MaxInMatrix {
    public static void main(String[] args) {

        int inputA, inputB;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row of matrix : ");
        inputA = scanner.nextInt();
        System.out.println("Enter column of matrix : ");
        inputB = scanner.nextInt();


        int array[][] = new int[inputA][inputB];

        System.out.println("Enter the elements of matrix : ");
        for (int i = 0; i < inputA; i++) {
            for (int j = 0; j < inputB; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        int maxValue = array[0][0];

        for (int i = 0; i < inputA; i++) {
            for (int j = 0; j < inputB; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                }
            }
        }
        System.out.println("Max element of matrix = " + maxValue);
    }
}
