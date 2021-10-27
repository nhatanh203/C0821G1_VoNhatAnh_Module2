package bai_17_serialization.bai_tap;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    Scanner scanner = new Scanner(System.in);
    private static List<Product> product = new ArrayList<>();
        List<Product> productwriteFile;
    {
        try {
            productwriteFile = writeToFile("src/bai_17_serialization/bai_tap/product.txt", product);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    List<Product> productReadFile = readFile("src/bai_17_serialization/bai_tap/product.txt");
    static {
      product.add(new Product(1,"coca","Cocacola",12000));
      product.add(new Product(2,"pepsi","Pepsi",18000));
      product.add(new Product(3,"socola","Socolalalala",3000));
    }

    public void addProduct(){
        System.out.println("Nhập id sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm : ");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất : ");
        String producer = scanner.nextLine();
        System.out.println("Nhập giá tiền sản phẩm : ");
        int price = Integer.parseInt(scanner.nextLine());
        Product prd = new Product(id,nameProduct,producer,price);
        product.add(prd);
    }

    public void displayProduct(){
        for(Product products : product){
            System.out.println(products);
        }
    }

    public void findProduct(){
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
    public static List<Product> writeToFile(String path, List<Product> product) throws IOException {
        try {
            FileOutputStream output = new FileOutputStream(path);
            ObjectOutputStream objectOutput = new ObjectOutputStream(output);
            objectOutput.writeObject(product);
            output.close();
            objectOutput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }

    public static List<Product> readFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInput = new FileInputStream(path);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            products = (List<Product>) objectInput.readObject();
            fileInput.close();
            objectInput.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }
}
