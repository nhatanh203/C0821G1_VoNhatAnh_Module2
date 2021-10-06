package bai_2_loop_statement.bai_tap;

public class ShowFirstPrimes {
    public static void main(String[] args) {
        int count = 0;
        int status = 1;
        int num = 3;
        System.out.println("The first 20 primes are : ");
        System.out.println(2);
        for (int i = 2; i <= 20; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
                count++;
            }
            status = 1;
            num++;
        }
    }
}


