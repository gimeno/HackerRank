import java.util.Scanner;

/**
 * Created by Roberto on 01/03/2018.
 */
public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int numApples = 0;
        int numOranges = 0;

        for (int i = 0; i < apples.length; i++) {
            if (apples[i] > 1) {
                if ((apples[i] + a) >= s && t >= (apples[i] + a)) {
                    numApples++;
                }
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] < -1) {
                if ((oranges[i] + b) >= s && t >= (oranges[i] + b)) {
                    numOranges++;
                }
            }
        }

        System.out.println(numApples);
        System.out.println(numOranges);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }

}
