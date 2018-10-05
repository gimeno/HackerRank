import java.util.Scanner;

/**
 * Created by Roberto on 01/03/2018.
 */
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] ar) {
        int maxHeight = ar[0];
        int numberCandlesToBlow = 0;
        for (int i = 0; i < ar.length; i++) {
            if (maxHeight == ar[i]) {
                numberCandlesToBlow++;
            } else if (ar[i] > maxHeight) {
                maxHeight = ar[i];
                numberCandlesToBlow = 1;
            }
        }

        return numberCandlesToBlow;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
