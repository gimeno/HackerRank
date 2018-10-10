import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Roberto on 19/03/2016.
 */
public class ArrayTarget {
    public static void main(String[] args) {
        int[] enteros = {1, 2, 3, 4, 5};
        int target = 6;
        ArrayList<String> pairs = new ArrayList<>();

        for (int i = 0; i < enteros.length; i++) {
            for (int j = i; j < enteros.length; j++) {
                if ((enteros[i] + enteros[j]) == target) {
                    pairs.add(String.valueOf(enteros[i]) + " ," + String.valueOf(enteros[j]));
                }
            }
        }

        for (String pair : pairs) {
            System.out.println(pair);
        }

    }
}
