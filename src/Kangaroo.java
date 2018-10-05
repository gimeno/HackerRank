import java.util.Scanner;

/**
 * Created by Roberto on 01/03/2018.
 */
public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return "NO";
        }

        while (x1 < x2) {
            x1 += v1;
            x2 += v2;
        }

        if (x1 == x2) {
            return "YES";
        } else {
            return "NO";
        }

//        return move(x1, v1, x2, v2);
    }

    static String move(int x1, int v1, int x2, int v2) {
        if (x1 == x2) {
            return "YES";
        } else if (x1 > x2) {
            return "NO";
        }

        return move(x1 + v1, v1, x2 + v2, v2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
