package bai_12_java_collection_framework.bai_tap;

import review.student_management.Student;

import java.util.*;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    private static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product("Socola", 1, 12000));
        list.add(new Product("Candy", 2, 8000));
        list.add(new Product("Milk", 3, 10000));
    }

    //1. Phương thức thêm sản phẩm :
    public void addProduct() {
        System.out.println("Nhập tên sản phẩm muốn thêm : ");
        String name = scanner.nextLine();
        System.out.println("Nhập id của sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá của sản phẩm : ");
        int prices = Integer.parseInt(scanner.nextLine());
        Product product = new Product(name, id, prices);
        System.out.println("Nhập vị trí index của sản phẩm : ");
        int index = Integer.parseInt(scanner.nextLine());
        list.add(index, product);
        System.out.println("Thêm sản phẩm thành công !");
    }

    //    2.Phương thức xoá sản phẩm theo index :
    public void deleteProduct(int index) {
        list.remove(index);
    }

    //    3.Phương thức hiển thị danh sách sản phẩm :
    public void displayListProduct() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    //    4.Phương thức sắp xếp sản phẩm theo gía :
    public void sortProduct() {
        Collections.sort(list, new Product());
        displayListProduct();
    }

    //    5.Phương thức sửa thông tin sản phẩm theo id :
    public void editProduct(int index) {
        boolean check = false;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).getId() == index) {
                check = true;
                System.out.println("Nhập tên sản phẩm muốn sửa : ");
                String name = scanner.nextLine();
                list.get(i).setName(name);
                System.out.println("Nhập id sản phẩm muốn sửa : ");
                int id = Integer.parseInt(scanner.nextLine());
                list.get(i).setId(id);
                System.out.println("Nhập giá sản phẩm muốn sửa : ");
                int prices = Integer.parseInt(scanner.nextLine());
                list.get(i).setPrices(prices);
                break;
            }
        }
        if (!check) {
            System.out.println("");
        } else {
            displayListProduct();
        }
    }
// 6. Tìm kiếm sản phẩm theo tên
    public void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của sản phẩm muốn tìm ");
        String nameProduct = scanner.nextLine();
        boolean check = false;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (nameProduct.equals(list.get(i).getName())) {
                    System.out.println("Sản phẩm đang có trong danh sách ");
            }
//            else {
//                System.out.println("Sản phảm hiện không có trong danh sách ");
//            }
        }
    }
}
