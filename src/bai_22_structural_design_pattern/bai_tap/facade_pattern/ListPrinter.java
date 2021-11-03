package bai_22_structural_design_pattern.bai_tap.facade_pattern;

import java.util.List;

public class ListPrinter {
    public static void printList(List<Integer> numbers){
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}