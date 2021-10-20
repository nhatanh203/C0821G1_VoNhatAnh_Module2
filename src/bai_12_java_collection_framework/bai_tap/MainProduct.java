package bai_12_java_collection_framework.bai_tap;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager product = new ProductManager();
        int switchCs = 0;
        do {
            System.out.println("-----Hệ Thống Quản Lí Sản Phẩm-----");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Xoá sản phẩm ");
            System.out.println("3. Hiển thị danh sách sản phẩm ");
            System.out.println("4. Sắp xếp danh sách sản phẩm theo giá tăng dần ");
            System.out.println("5. Sửa thông tin sản phẩm  ");
            System.out.println("6. Tìm kiếm sản phẩm theo sách  ");
            System.out.println("0. Thoát khỏi chương trình ");
            System.out.print("Mời bạn chọn chức năng : ");
            switchCs = Integer.parseInt(scanner.nextLine());
            switch (switchCs) {
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    System.out.println("Nhập vị trí index sản phẩm cần xóa : ");
                    int index = Integer.parseInt(scanner.nextLine());
                    product.deleteProduct(index);
                    System.out.println("Xoá sản phẩm thành công ! ");
                    break;
                case 3:
                    product.displayListProduct();
                    break;
                case 4:
                    product.sortProduct();
                    break;
                case 5:
                    System.out.println("Nhập id sản phẩm muốn sửa thông tin :");
                    int index1 = Integer.parseInt(scanner.nextLine());
                    product.editProduct(index1);
                    break;
                case 6:
                    product.findProduct();
                    product.displayListProduct();
            }
        } while (switchCs != 0);

    }
}
