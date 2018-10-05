import java.util.Scanner;

/**
 * Created by Roberto on 01/03/2018.
 */
public class MiniMaxSum {
    static void miniMaxSum(long[] arr) {
        long max = arr[0];
        long min = arr[0];
        long sum = 0;
        for (long i : arr) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        miniMaxSum(arr);
        in.close();
    }
}
