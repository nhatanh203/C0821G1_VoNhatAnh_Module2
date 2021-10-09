package review.bank_account;

import java.text.NumberFormat;
import java.util.Scanner;

public class BankAccount {
    Scanner scanner = new Scanner(System.in);
    private long numAccount;
    private String nameAccount;
    private double moneyAccount;


    public BankAccount() {

    }

    public BankAccount(long numAccount, String nameAccount, double moneyAccount) {
        this.numAccount = numAccount;
        this.nameAccount = nameAccount;
        this.moneyAccount = moneyAccount;
    }

    public long getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(long numAccount) {
        this.numAccount = numAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }
//Phương thức toString để trả về chuỗi chứa toàn bộ thông tin tài khoản, yêu cầu định dạng tiền tệ.
//Để định dạng tiền tệ trong Java bằng NumberFormat chúng ta sẽ sử dụng phương thức getCurrencyInstance()

    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String money = currency.format(moneyAccount);
        return numAccount + "-" + nameAccount + "-" + money;
    }
//Phương thức nạp tiền
//    Sử dụng câu lệnh if-else để check số tiền nạp vào lớn hơn 0 thì in ra số tiền vừa nạp và cộng vào tài khoản
//    Ngược lại nếu số tiền bé hơn 0 thì báo lỗi

    public double recharge() {
        double input;
        System.out.print("Nhập số tiền nạp vào thẻ : ");
        input = scanner.nextDouble();
        if (input >= 0) {
            moneyAccount = input + moneyAccount;
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String money = currency.format(input);
            System.out.println("Số tiền vừa nạp vào tài khoản là :   " + money);
        } else {
            System.out.println("Số tiền nạp không hợp lệ !");
        }
        return input;
    }

/*    Khởi tạo phương thức rút tiền :
   - Tạo biến fees ( Lệ phí ) được mặc định bằng 3 có kiểu dữ liệu double
   - Cho người dùng nhập vào số tiền muốn rút
   - Sử dụng if-else để check nếu số tiền người dùng nhập ít hơn số tiền trong tài khoản cộng với chi phí thì hơp lệ
   - Nếu số tiền nhập vào lớn hơn số tiên trong tài khoản thì báo tài khoản không đủ*/

    public double takeMoney() {
        double fees = 2.5;
        double output;
        System.out.print("Nhập số tiền muốn rút : ");
        output = scanner.nextDouble();
        if (output <= (moneyAccount - fees)) {
            moneyAccount = moneyAccount - (output + fees);
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String money = currency.format(output);
            System.out.println("Bạn vừa rút + " + money + " ra khỏi tài khoản. "
                    + "\n" + " Lệ phí là 2.5 ! ");
        } else {
            System.out.println("Số dư trong tài khoản không đủ để rút.");
            return takeMoney();
        }
        return output;
    }

    /*Phương thức đáo hạn :
     * Biến interest có lãi suất cố định là 0.035
     * Mỗi lần đến kỳ đáo hạn thì số tiền trong tài khoản = số tiền trong tài khoản + số tiền trong tài khoản * lãi suất*/
    public double expire() {
        double interest = 0.035;
        moneyAccount = moneyAccount + moneyAccount * interest;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String money = currency.format(moneyAccount);
        System.out.println("Bạn vừa nhận được : " + money);
        return moneyAccount;
    }

    /*Phương thức chuyển khoản :
     * Cho người dùng nhập vào số tài khoản của người muốn chuyển
     * Cho người dùng nhập vào số tiền muốn chuyển, nếu số tiền chuyển ít hơn số trong tài khoản thì hợp lệ
     * Nếu số tiền chuyển lớn hơn số trong tài khoản thì báo lỗi*/

    public double transfer() {
        double accountToSend;
        double moneySend;
        System.out.print("Nhập số tài khoản muốn chuyển đến  : ");
        accountToSend = scanner.nextDouble();
        System.out.println("Nhập số tiền muốn chuyển đến tài khoản : ");
        moneySend = scanner.nextDouble();
        if (moneySend <= moneyAccount) {
            moneyAccount = moneyAccount - moneySend;
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String money = currency.format(moneyAccount);
            System.out.println("Bạn vừa chuyển khoản thành công : " + money +
                    "\n đến số tài khoản : " + accountToSend);
        } else {
            System.out.println("Số tiền chuyển khoản không hợp lệ !!");
        }
        return moneyAccount;
    }

    /*Phương thức in kết quả ra màn hình */
    void outputAccount() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String money = currency.format(moneyAccount);
        System.out.println("Số tài khoản : " + numAccount);
        System.out.println("Tên của chủ tài khoản : " + nameAccount);
        System.out.println("Số tiền có trong tài khoản : " + money);
    }
}
