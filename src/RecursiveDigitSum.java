import java.util.Scanner;

/**
 * Created by Roberto on 03/03/2018.
 */
public class RecursiveDigitSum {

    static int digitSum(String n, int k) {

        StringBuilder numberP = new StringBuilder();
        for (int i = 0; i < k; i++) {
            numberP.append(n);
        }

        if (numberP.toString().equals("")) {
            return 0;
        }

        return superDigit(numberP.toString());
    }

    static int superDigit(String number) {
        char[] digits = number.toCharArray();
        if (digits.length == 1) {
            return Integer.valueOf(number);
        }

        int temp = 0;
        for (char digit : digits) {
            temp += Character.getNumericValue(digit);
        }
        return superDigit(String.valueOf(temp));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int k = in.nextInt();
        int result = digitSum(n, k);
        System.out.println(result);
        in.close();
    }

}
