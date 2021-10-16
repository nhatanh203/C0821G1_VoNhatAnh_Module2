package bai_10_dsa_list.bai_tap.implementation_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    //    Sức chứa của MyList
    private static final int DEFAULT_CAPACITY = 10;
    //Mảng chứa các phần tử
    Object elements[];

    //Sức chứa mặc định khi khởi tạo bằng constructor không tham số
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Constructor với sức chứa được truyền vào
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            System.err.println("capacity không hợp lệ !");
        }
    }

    //Phương thức trả về số lượng phần tử
    int size() {
        return this.size;
    }

    //Phương thức clear MyList
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    // Phương thức thêm 1 phần tử vào MyList
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    //Phương thức thêm 1 phần tử vào vị trí
    public void add(E element, int index) {
        if (index > elements.length) {
            System.err.println("index không hợp lệ !");
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
        }
        elements[index] = element;
        size++;
    }

    //Phương thức tăng kích thước của MyList
    void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            System.err.println("minCapacity không hợp lệ !");
        }
    }

    //Phương thức lấy về phần tử tại 1 vị trí index
    public E get(int index) {
        return (E) elements[index];
    }

    //Phương thức lấy index của một phần tử
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //Phương thức kiểm tra phần tử có trong MyList hay không
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    //    Phương thức sao chép ra một MyList khác ở thời điểm hiện tại
    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    //Phương thức xoá 1 phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            System.err.println("index không hợp lệ !");
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

}

