import java.util.Scanner;

/**
 * Created by Roberto on 27/02/2016.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i <= n-1; i++) {
            for (int j = n-1; j >= 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }

}
