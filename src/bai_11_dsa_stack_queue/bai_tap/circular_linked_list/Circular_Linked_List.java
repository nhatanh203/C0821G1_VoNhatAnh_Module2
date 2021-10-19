package bai_11_dsa_stack_queue.bai_tap.circular_linked_list;

public class Circular_Linked_List {
    static class Node {
        int data;
        Node link;
    }

    static class Queue {
        // Rear là phần tử được đưa vào cuối cùng trong hàng đợi
// Front là phần tử được đưa vào đầu tiên trong hàng đợi
        Node front, rear;
    }

    //   enQueue là hàm thực hiện chèn 1 phần tử
//   Hàm khởi tạo hàng đợi vòng
    static void enQueue(Queue q, int value) {
//       B1: Tạo node mới, thêm giá trị vào node
        Node temp = new Node();
        temp.data = value;
//      Kiểm tra hàng đợi trống hay không
        if (q.front == null) {
//          Nếu true thì front = rear = node vừa tạo
            q.front = temp;
        } else
//           nếu false rear = node vừa tạo
            q.rear.link = temp;

        q.rear = temp;
        q.rear.link = q.front;
    }

    //    deQueue là hàm thực hiện lấy ra 1 phần tử và luôn là phần tử đầu
    static int deQueue(Queue q) {
//    Kiểm tra hàng đợi trống hay không
        if (q.front == null) {
            System.out.println("Hàng đợi rỗng !!");
            return Integer.MIN_VALUE;
        }
        int value;
//    Kiểm tra Front == Rear hay không
        if (q.front == q.rear) {
//        Nếu true gán Front = Rear = null
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
//        nếu không gán Front vào node liền sau
            Node temp = q.front;
            value = temp.data;
//        trỏ địa chỉ Front trong node Rear tới node Front mới trỏ.
            q.front = q.front.link;
            q.rear.link = q.front;
        }

        return value;
    }

    //    Hàm hiển thị phần tử trong danh sách liên kết vòng
    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("Phần tử trong liên kết vòng là : ");
        while (temp.link != q.front) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main(String args[]) {
//        Tạo Queue mới và phần tử trước và sau
        Queue q = new Queue();
        q.front = q.rear = null;

        // Chèn các phần tử vào danh sách liên kết vòng
        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        // Hiển thị các phần tử có trong ds liên kết vòng
        displayQueue(q);

        // Xoá phần tử
        System.out.println("Deleted value :" + deQueue(q));
        System.out.println("Deleted value :" + deQueue(q));

        // Các phần tử còn lại
        displayQueue(q);

        enQueue(q, 9);
        enQueue(q, 20);
        displayQueue(q);

    }

}
