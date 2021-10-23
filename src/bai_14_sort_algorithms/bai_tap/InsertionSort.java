package bai_14_sort_algorithms.bai_tap;

public class InsertionSort {
    static int[] array = {1, 4, 5, 6, 3, 2, 1, 5, 6, 7, 8, 3, 2, 9};

    public static void insertionSort(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            // chèn danh sách [i] vào danh sách phụ đã sắp xếp [0 ... i-1]/*
            // // để danh sách [0..i] được sắp xếp */
            int currentElement = array[i];
            int k;
            for (k = i - 1; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            // chèn element hiện tại vào danh sách [k + 1]
            array[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}