import java.util.Scanner;

/**
 * Created by Roberto on 03/03/2018.
 */
public class XorAndSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = Long.parseLong(in.nextLine(), 2);
        long b = Long.parseLong(in.nextLine(), 2);
        long sum = 0;
        final long modulo = 1000000007;
        for (long i = 0; i <= 314159; i++) {
            sum = (sum + (a ^ (b << i))) %modulo;
            sum %= modulo;
        }

        System.out.println(sum);
    }
}
