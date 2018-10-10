package interview.arrays;

import java.util.Arrays;

/**
 * @author Roberto on 09/10/2018
 * Left rotation problem
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class LeftRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotLeft(arr, 4)));
        System.out.println(Arrays.toString(rotLeft(arr, 3)));
    }

    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int arrRotated[] = new int[length];
        int diff = length - d;
        int newPosition;
        for (int i = 0; i < length; i++) {
            newPosition = (i + diff) % length;
            arrRotated[newPosition] = a[i];
        }

        return arrRotated;
    }



}
