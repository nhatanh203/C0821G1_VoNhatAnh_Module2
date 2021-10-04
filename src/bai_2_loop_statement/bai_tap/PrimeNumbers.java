package bai_2_loop_statement.bai_tap;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int num = 1; num < 100; ++num) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 0 && num > 1) {
                System.out.println(num);
            }
        }
    }
}