package bai_11_dsa_stack_queue.bai_tap.reverse_array;

import java.util.Stack;

public class ReverseStringArray {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();

        String mWord = "Hello Words";
        String array[] = mWord.split("");
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(array[i]);
        }
        for (int i = 0; i < mWord.length(); i++) {
            array[i] = wStack.pop();
        }
        String rvWord = "";
        for (int i = 0; i < array.length; i++) {
            rvWord += array[i];
        }
        System.out.println("Mảng chuỗi sau khi bị đảo ngược : " + rvWord);
    }
}
