package bai_17_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> product = new ArrayList<>();
    static String path = "src/bai_17_serialization/bai_tap/product.txt";

    public static void addProduct() {
        System.out.println("Nhập id sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm : ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất : ");
        String producer = scanner.nextLine();
        System.out.println("Nhập giá tiền sản phẩm : ");
        int price = Integer.parseInt(scanner.nextLine());
        Product prd = new Product(id, nameProduct, producer, price);
        product = readFile();
        product.add(prd);
    }

    public static void displayProduct() {
        for (Product products : product) {
            System.out.println(products);
        }
    }

    public static void findProduct() {
        System.out.println("Nhập id sản phẩm : ");
        int idProduct = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < product.size(); i++) {
            if (idProduct == product.get(i).getIdProduct()) {
                check = true;
                System.out.println("Sản phẩm đã có trong danh sách");
                System.out.println(product.get(i).toString());
                break;
            }
        }
        if (!check) {
            System.out.println("Sản phẩm không có trong danh sách ");
        }
    }

    public static void writeFile(List<Product> product) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(product);
            objectOutputStream.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static List<Product> readFile() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
        return products;
    }

    public static void main(String[] args) {
        int switchCs = 0;
        do {
            System.out.println("---Hệ thống quản lí sản phẩm---");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Hiển thị sản phẩm");
            System.out.println("3.Tìm sản phẩm");
            System.out.println("0.Kết thúc hệ thống !");
            System.out.print("Mời nhập : ");
            switchCs = Integer.parseInt(scanner.nextLine());
            switch (switchCs) {
                case 1:
                    addProduct();
                    writeFile(product);
                    break;
                case 2:
                    displayProduct();
                    break;
                case 3:
                    findProduct();
                    break;
                case 0:
                    System.out.println("Cảm ơn vì đã sử dụng chương trình !!!");
                    break;
            }
        } while (switchCs != 0);
    }
}
