package bai_11_dsa_stack_queue.thuc_hanh.implementation_stack;

import static bai_11_dsa_stack_queue.thuc_hanh.implementation_stack.GenericStackClient.stackOfIStrings;
import static bai_11_dsa_stack_queue.thuc_hanh.implementation_stack.GenericStackClient.stackOfIntegers;

public class MainStack {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
