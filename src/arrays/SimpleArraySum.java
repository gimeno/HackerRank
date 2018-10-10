import java.util.Scanner;

/**
 * Created by Roberto on 27/02/2016.
 */
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
//Esto es una prueba
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        System.out.println(total);
    }
}
