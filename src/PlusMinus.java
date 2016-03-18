import java.util.Scanner;

/**
 * Created by Roberto on 22/02/2016.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positivos++;
            } else if (arr[i] < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }
        double pos = (double)positivos / (double)n;
        double neg = (double)negativos / (double)n;
        double zer = (double)zeros / (double)n;

        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zer);

    }


}
