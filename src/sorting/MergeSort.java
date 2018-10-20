package sorting;

/**
 * @author Roberto on 14/10/2018
 */
public class MergeSort {

    /**
     * MergeSort(arr[], l,  r)
     * If r > l
     * 1. Find the middle point to divide the array into two halves:
     * middle m = (l+r)/2
     * 2. Call mergeSort for first half:
     * Call mergeSort(arr, l, m)
     * 3. Call mergeSort for second half:
     * Call mergeSort(arr, m+1, r)
     * 4. Merge the two halves sorted in step 2 and 3:
     * Call merge(arr, l, m, r)
     */
    public static void mergeSortArray(int arr[], int left, int right) {

        if (left < right) {
            int middle = (left + right) / 2;
            mergeSortArray(arr, left, middle);
            mergeSortArray(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }

    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    private static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        mergeSortArray(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
