package bai_20_structural_design_pattern.bai_tap.facade_pattern;

import java.util.List;

public class RandomListFacade {
    public static void printRandomEvenList() {
        RandomList random = new RandomList();
        List<Integer> list;
        System.out.println("Tạo một danh sách các số nguyên ngẫu nhiên :");
        list = random.generateList(8, 20, 0);
        ListPrinter.printList(list);
        System.out.println("Các số chẵn còn lại sau khi loại các số lẻ là :");
        list = ListFilter.filterOdd(list);
        ListPrinter.printList(list);
    }
}
