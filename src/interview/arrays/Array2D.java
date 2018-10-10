package interview.arrays;

import java.util.Scanner;

/**
 * @author Roberto on 09/10/2018
 * 2D Array - DS
 * https://www.hackerrank.com/challenges/2d-array/problem
 */
public class Array2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][] arr) {
        int largestSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (i >= 4) {
                continue;
            }
            for (int j = 0; j < 6; j++) {
                if (j >= 4) {
                    continue;
                }
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (largestSum < sum) {
                    largestSum = sum;
                }
            }
        }

//        int j = 0;
//        for (int i = 0; i < 6; i++) {
//
//        }

        return largestSum;
    }

}
