package bai_17_serialization.bai_tap;
import java.io.*;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int switchCs = 0;
        ProductManagement productMana = new ProductManagement();
        do{
            System.out.println("---Hệ thống quản lí sản phẩm---");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Hiển thị sản phẩm");
            System.out.println("3.Tìm sản phẩm");
            System.out.println("0.Kết thúc hệ thống !");
            System.out.print("Mời nhập : ");
            switchCs = Integer.parseInt(scanner.nextLine());
            switch(switchCs){
                case 1 : productMana.addProduct();
                break;
                case 2 : productMana.displayProduct();
                break;
                case 3 : productMana.findProduct();
                break;
                case 0 :
                    System.out.println("Cảm ơn vì đã sử dụng chương trình !!!");
                    break;
            }
        }while(switchCs != 0);
    }
}
