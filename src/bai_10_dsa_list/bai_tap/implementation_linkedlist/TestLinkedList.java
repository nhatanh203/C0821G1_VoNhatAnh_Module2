package bai_10_dsa_list.bai_tap.implementation_linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student() {

            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();

        Student student1 = new Student(1, "Anh");
        Student student2 = new Student(2, "Tuan");
        Student student3 = new Student(3, "Nam");
        Student student4 = new Student(4, "Hoang");

        myLinkedList.addFirst(student1);
        myLinkedList.addLast(student3);
        System.out.println(myLinkedList.indexOf(student1));
        myLinkedList.printList();


        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }

    }

}

