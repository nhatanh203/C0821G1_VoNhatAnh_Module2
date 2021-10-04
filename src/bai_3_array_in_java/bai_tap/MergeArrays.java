package bai_3_array_in_java.bai_tap;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int count = 0;

        for (int element : array1) {
            result[count] = element;
            count++;
        }

        for (int element : array2) {
            result[count] = element;
            count++;
        }
        System.out.println(Arrays.toString(result));
    }
}
