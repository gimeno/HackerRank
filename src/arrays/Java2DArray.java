package arrays;

import java.util.Scanner;

/**
 * Created by Roberto on 17/05/2017.
 * https://www.hackerrank.com/challenges/java-2d-array/problem
 */
public class Java2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

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
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (largestSum < sum) {
                    largestSum = sum;
                }
            }
        }

        System.out.println(largestSum);
    }

}
