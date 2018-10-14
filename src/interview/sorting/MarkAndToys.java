package interview.sorting;

import java.util.Arrays;

/**
 * @author Roberto on 14/10/2018
 * Mark And Toys
 * https://www.hackerrank.com/challenges/mark-and-toys/problem
 */
public class MarkAndToys {

    public static void main(String[] args) {
        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
        int money = 50;
        System.out.println("How many toys can I buy with " + money + "? " + maximumToys(prices, 50));
    }

    private static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int i = 0;
        while (i < prices.length && k >= prices[i]) {
            k -= prices[i];
            i++;
        }
        return i;
    }
}
