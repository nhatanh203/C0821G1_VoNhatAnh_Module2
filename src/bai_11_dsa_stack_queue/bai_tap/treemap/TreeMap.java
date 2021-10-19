package bai_11_dsa_stack_queue.bai_tap.treemap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static Map<Character, Integer> checkDisplay(String string) {
        char[] array = string.toLowerCase().toCharArray();
//        Phương thức toCharArray() được sử dụng để chuyển đổi chuỗi thành các mảng ký tự.
//         trả về một mảng ký từ có độ dài tương đương độ dài của chuỗi
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
//             containsKey() dùng để kiểm tra một Key có tồn tại trong HashMap hay không.
//             Nếu không tồn tại nó sẽ trả về false, ngược lại true
            if (!map.containsKey(array[i])) {
//               hashmap.put(K key, V value)
//   một phương thức được sử dụng để thêm một cá thể (key/value) vào hashmap
                map.put(array[i], 1);
            } else {
//  - Phương thức replace() được sử dụng
//    để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới
//  - HashMap get(Object key) trong java dùng để lấy giá trị của key được chỉ định
//      Nếu key không chứa trong HashMap nó sẽ trả về null
                map.replace(array[i], map.get(array[i]) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println("Nhập từ cần check số lần xuất hiện : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for (Map.Entry<Character, Integer> check : checkDisplay(string).entrySet()) {
            System.out.println(check);
        }
    }
}
