package bai_10_dsa_list.bai_tap.implementation_arraylist;

public class MyListTest {
    public static class Student {
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

    public static void main(String[] args) {
        Student a = new Student(1, "Anh");
        Student b = new Student(2, "Tuan");
        Student c = new Student(3, "Bao");
        Student d = new Student(4, "Hoang");
        Student e = new Student(5, "Linh");
        Student f = new Student(5, "Linh");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        studentMyList.add(f, 3);
        studentMyList.size();

        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());

        }
        System.out.println("Số phần tử là : " + studentMyList.size());
        System.out.println(studentMyList.get(3).getName());
        System.out.println(studentMyList.indexOf(c));
        System.out.println(studentMyList.contains(c));

        newMyList = studentMyList.clone();
        for (int i = 0; i < newMyList.size(); i++) {
            System.out.println(newMyList.get(i).getName());
        }
    }
}
