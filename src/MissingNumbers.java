import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Roberto on 03/03/2018.
 */
public class MissingNumbers {

    static int[] missingNumbers(int[] arr, int[] brr) {
        HashMap<Integer, Integer> mapA = getMap(arr);
        HashMap<Integer, Integer> mapB = getMap(brr);

        List<Integer> missingNumbers = new ArrayList<>();
        for (Integer key : mapB.keySet()) {
            int frequencyA = mapA.get(key);
            int frequencyB = mapB.get(key);
            if (frequencyA < frequencyB) {
                missingNumbers.add(key);
            }
        }

        return new int[0];
    }

    static HashMap<Integer, Integer> getMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp;
        for (int number : arr) {
            if (map.containsKey(number)) {
                temp = map.get(number);
                map.put(number, temp++);
            } else {
                map.put(number, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[n];
        for (int brr_i = 0; brr_i < n; brr_i++) {
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
