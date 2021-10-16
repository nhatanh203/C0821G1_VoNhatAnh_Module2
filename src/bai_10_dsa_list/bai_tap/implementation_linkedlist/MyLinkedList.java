package bai_10_dsa_list.bai_tap.implementation_linkedlist;

import java.util.Arrays;

public class MyLinkedList<E> {
    class Node {
        private Node next;
        private Object data;


        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //        Phần tử đầu tiên của linkedList
    private Node head;
    //        Số tượng phần tử trong LinkedList
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
//            Khai báo biến temp trỏ đến head
        Node temp = head;
//            Khai báo 1 node là holder
        Node holder;
//            Cho con trỏ chạy đến index = -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
//            Cho holder tham chiếu đến vị trí index
        holder = temp.next;
//            Node tại vị trí index -1 sẽ trỏ tới node mới
        temp.next = new Node(element);
//            Node mới sẽ trỏ đến holder
        temp.next.next = holder;
//            Tăng số lượng phần tử trong danh sách tăng lên 1
        numNodes++;
    }

    public Object get(int index) {
        Node temp = head;
//            Khai báo biến temp trỏ tới head
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
//    Phương thức size trả về số lượng các phần tử có trong danh sách

    public int size() {
        return numNodes;
    }

    //    Phương thức xóa 1 phần tử tại vị trí index: remove(int index)
    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            System.err.println(" Index không hợp lệ !");
        }
//        Khai báo biến temp trỏ đến head
        Node temp = head;
        Object data;

//        Nếu index = 0 thì sẽ trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
//    Phương thức contains kiểm tra phần tử có trong danh sách không

    public boolean contains(E elements) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(elements)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //    Phương thức indexOf trả về vị trí của phần tử trong danh sách
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void printList() {
        System.out.println("list (" + numNodes + ")");
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            System.out.println("element " + i + ": " + temp.data);
            temp = temp.next;
        }
        System.out.println("\n");

    }
}


