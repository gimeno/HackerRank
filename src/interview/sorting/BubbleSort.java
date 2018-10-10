package interview.sorting;

/**
 * @author Roberto on 10/10/2018
 * Sorting: Bubble Sort
 * https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
 */
public class BubbleSort {

    public static void main(String[] args) {

        countSwaps(new int[]{3,2,1});
        countSwaps(new int[]{8,6,7,1,2,5,4,3});

    }

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {

        int n = a.length;
        int swaps = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);

    }

}
