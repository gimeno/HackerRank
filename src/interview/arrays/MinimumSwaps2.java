package interview.arrays;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwaps2 {

    public static void main(String[] args) {
//        System.out.println(minimumSwaps(new int[]{0, 1, 2, 3}));
//        System.out.println(minimumSwaps(new int[]{3, 1, 2, 4}));
//        System.out.println(minimumSwaps(new int[]{0, 1, 3, 2}));

        int[] a = {1, 5, 4, 3, 2};
        System.out.println(minSwaps(a));
    }

    static int minimumSwaps(int[] arr) {

        int swap = 0;
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int j = i, cycle = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = arr[j] - 1;
                cycle++;
            }

            if (cycle != 0)
                swap += cycle - 1;
        }
        return swap;
    }

    // Function returns the minimum number of swaps
    // required to sort the array
    public static int minSwaps(int[] arr) {
        int n = arr.length;

        // Create two arrays and use as pairs where first
        // array is element and second array
        // is position of first element
        ArrayList<Pair<Integer, Integer>> arrpos =
                new ArrayList<>();
        for (int i = 0; i < n; i++)
            arrpos.add(new Pair<>(arr[i], i));

        // Sort the array by array element values to
        // get right position of every element as the
        // elements of second array.
        arrpos.sort(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1,
                               Pair<Integer, Integer> o2) {
                if (o1.getKey() > o2.getKey())
                    return -1;

                    // We can change this to make it then look at the
                    // words alphabetical order
                else if (o1.getKey().equals(o2.getKey()))
                    return 0;

                else
                    return 1;
            }
        });

        // To keep track of visited elements. Initialize
        // all elements as not visited or false.
        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);

        // Initialize result
        int ans = 0;

        // Traverse array elements
        for (int i = 0; i < n; i++) {
            // already swapped and corrected or
            // already present at correct pos
            if (vis[i] || arrpos.get(i).getValue() == i)
                continue;

            // find out the number of  node in
            // this cycle and add in ans
            int cycle_size = 0;
            int j = i;
            while (!vis[j]) {
                vis[j] = true;

                // move to next node
                j = arrpos.get(j).getValue();
                cycle_size++;
            }

            // Update answer by adding current cycle.
            if (cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }

        // Return result
        return ans;
    }

}
