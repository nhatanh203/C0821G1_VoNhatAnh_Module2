package bai_14_sort_algorithms.bai_tap;

public class InsertionSortSetting {
    static int[] list = {1, 3, 5, 6, 3, 2, 4, 5, 21, 4, 5, 65, 7, 9};

    static void insertionSort(int[] list) {
        int i;
        for (i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}

