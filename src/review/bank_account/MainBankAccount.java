package review.bank_account;

import review.input_ouput_vehicle_information.Vehicle;

import java.util.Scanner;

public class MainBankAccount {
    static Scanner scanner = new Scanner(System.in);

    //tạo phương thức input để nhập thông tin khách hàng
//    Mặc định số tiền trong tài khoản là 50
    static void inputAccount(BankAccount acc) {
        System.out.println("Nhập số tài khoản : ");
        acc.setNumAccount(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập tên tài khoản : ");
        acc.setNameAccount(scanner.nextLine());
        acc.setMoneyAccount(50);
    }

    public static void main(String[] args) {
        //        Tạo 1 mảng với giá trị bằng null để chứa số lượng tài khoản nhập vào
        BankAccount array[] = null;
        int switchAcc, index = 0;
//        Tạo biến in như đại diện cho giá trị nhập vào, numAcc đại diện giá trị số tài khoản
        long in, numAcc;
        //        Tạo biến check và để giá trị mặc định true

        boolean check = true;
//        Sử dụng vòng lặp do-while để cho người dùng lựa chọn các kiểu hiển thị trước khi switch được sử dụng
        do {
            System.out.println("1.Nhập phím 1 nếu muốn nhập thông tin khách hàng \n"
                    + "2.Nhập phím 2 nếu muốn hiển thị danh sách thông tin của khách hàng\n"
                    + "3.Nhập phím 3 nếu muốn nạp tiền\n"
                    + "4.Nhập phím 4 nếu muốn rút tiền\n"
                    + "5.Nhập phím 5 nếu muốn hiển thị đáo hạn\n"
                    + "6.Nhập phím 6 nếu muốn chuyển khoản\n"
                    + "Nhập phím khác để thoát khỏi chương trình ! ");
            switchAcc = scanner.nextInt();
            switch (switchAcc) {
//                Cho người dùng nhập số lượng tài khoản
                case 1:
                    System.out.println("Nhập số lượng tài khoản bạn muốn nhập: ");
                    index = scanner.nextInt();
                    array = new BankAccount[index];
                    for (int i = 0; i < index; i++) {
                        System.out.println("Tài khoản số : " + (i + 1));
                        array[i] = new BankAccount();
                        inputAccount(array[i]);
                    }
                    break;
//                    Hiển thị toàn bộ thông tin của tài khoản đã nhập vào
                case 2:
                    for (int i = 0; i < index; i++) {
                        array[i].outputAccount();
                    }
                    break;
//                    Nạp tiền vào tài khoản
                case 3:
                    System.out.println("Nhập số tài khoản bạn muốn nạp tiền : ");
                    in = scanner.nextLong();
                    for (int i = 0; i < index; i++) {
                        numAcc = array[i].getNumAccount();
                        if (in == numAcc) {
                            System.out.println("Số tài khoản bạn chọn là : " + numAcc);
                            array[i].recharge();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
//                    Rút tiền khỏi tài khoản
                case 4:
                    System.out.println("Nhập số tài khoản bạn muốn rút tiền : ");
                    in = scanner.nextLong();
                    for (int i = 0; i < index; i++) {
                        numAcc = array[i].getNumAccount();
                        if (in == numAcc) {
                            System.out.println("Số tài khoản bạn chọn là : " + numAcc);
                            array[i].takeMoney();
                        }
                    }
                    break;
//                    Đáo hạn
                case 5:
                    System.out.println("Nhập số tài khoản bạn muốn đáo hạn : ");
                    in = scanner.nextLong();
                    for (int i = 0; i < index; i++) {
                        numAcc = array[i].getNumAccount();
                        if (in == numAcc) {
                            System.out.println("Số tài khoản bạn chọn là : " + numAcc);
                            array[i].expire();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
//                    Chuyển tiền đến tài khoản
                case 6:
                    for (int i = 0; i < index; i++) {
                        array[i].transfer();
                    }
                    break;
//
                default:
                    System.out.println("Cảm ơn vì đã sử dụng dịch vụ !!!");
                    check = false;
                    break;
            }
        } while (check);
    }
}
