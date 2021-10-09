package review.input_ouput_vehicle_information;

import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);

    //tạo phương thức input để nhập thông tin cho xe
    static void inputVehicle(Vehicle vehicle) {
        System.out.print("Nhập mã xe: ");
        vehicle.setInforVehicle(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhập tên chủ xe: ");
        vehicle.setOwner(scanner.nextLine());
        System.out.print("Nhập dung tích xe: ");
        vehicle.setCapacityVehicle(scanner.nextInt());
        System.out.print("Nhập trị giá xe: ");
        vehicle.setValue(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Mô tả: ");
        vehicle.setNote(scanner.nextLine());
    }

    public static void main(String[] args) {
//        Tạo 1 mảng với giá trị bằng null để chứa số lượng các xe nhập vào
        Vehicle array[] = null ;
//        Khai báo biến switchXe để sử dụng swichtcase, index để đặt giá trị của mảng
        int switchXe, index = 0;
//        Tạo biến check và để giá trị mặc định true
        boolean check = true;
//        Sử dụng vòng lặp do-while để cho người dùng lựa chọn các kiểu hiển thị trước khi switch được sử dụng
        do {
            System.out.println("1. Nhập 1 nếu muốn nhập thông tin \n" +
                    "2. Nhập 2 để xuất tiền thuế xe.\n" +
                    "Nhập số khác để thoát ! ");
            switchXe = scanner.nextInt();
//            Nếu người dùng nhập 1 thì switch case nhảy về 1 và cho người dùng nhập số lượng xe
            switch (switchXe) {
                case 1:
                    System.out.print("Nhập số lượng xe khai báo thuế : ");
                    index = scanner.nextInt();
                    //khai báo mảng array để chứa số lượng xe với các phần tử là index
                    array = new Vehicle[index];
//                    Duyệt mảng để hiển thị từng xe
                    for (int i = 0; i < index; i++) {
                        System.out.println("Xe thứ " + (i + 1));
                        array[i] = new Vehicle();
                        inputVehicle(array[i]);
                    }
                    break;
                case 2:
//                    Người dùng chọn 2 thì hiển thị ra các thông tin người dùng nhập và thuế đặt ở outputTax từ Vehicle
                    for (int i = 0; i < index; i++) {
                        array[i].outputTax();
                    }
                    break;
//                    Người dùng không nhập 1 trong 2 thì kết thúc và thoát switch case
                default:
                    System.out.println("Cảm ơn vì đã sử dụng dịch vụ !!!");
                    check = false;
                    break;
            }
        } while (check);
    }
}