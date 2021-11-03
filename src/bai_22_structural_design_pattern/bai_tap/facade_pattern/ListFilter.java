package bai_22_structural_design_pattern.bai_tap.facade_pattern;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    public static List<Integer> filterOdd(List<Integer> numbers){
        List<Integer> newList = new ArrayList<>();
        for (Integer number: numbers) {
            if(number % 2 == 0){
                newList.add(number);
            }
        }
        return newList;
    }
}