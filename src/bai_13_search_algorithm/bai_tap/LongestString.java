package bai_13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi: ");
        String str = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
//        Tìm chuỗi tăng có độ dài lớn nhất
        for (int i = 0; i < str.length(); i++) {
//           Vòng lặp bên ngoài tạo 1 linkedlist trung gian lưu các kí tự của tuổi tăng dần
            LinkedList<Character> list = new LinkedList<>();
//          Thêm 1 kí tự vào trong list
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
//                Vòng lặp bên trong kiểm tra kí tự tiếp theo có lớn hơn kí tự cuối cùng trong list không
                if (str.charAt(j) > list.getLast()) {
//                    Nếu có thì thêm kí tự vào
                    list.add(str.charAt(j));
                }
            }
//            So sánh kích cỡ của list trung gian và list chứa chuỗi tăng dần có kích thước lớn nhất
            if (list.size() > max.size()) {
//                Nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
//       Hiển thị chuỗi tăng dần dài nhất
        for (Character display : max) {
            System.out.print(display);
        }
        System.out.println();
    }
}
