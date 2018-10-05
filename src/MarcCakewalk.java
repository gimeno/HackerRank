import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Roberto on 03/03/2018.
 */
public class MarcCakewalk {

    static long marcsCakewalk(int[] calorie) {
        long miles = 0;
        Arrays.sort(calorie);
        reverse(calorie);
        for (int i = 0; i < calorie.length; i++) {
            miles += calorie[i]*Math.pow(2, new Double(i).intValue());
        }

        return miles;
    }

    static void reverse(int[] validData) {
        for(int i = 0; i < validData.length / 2; i++)
        {
            int temp = validData[i];
            validData[i] = validData[validData.length - i - 1];
            validData[validData.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calorie = new int[n];
        for(int calorie_i = 0; calorie_i < n; calorie_i++){
            calorie[calorie_i] = in.nextInt();
        }
        long result = marcsCakewalk(calorie);
        System.out.println(result);
        in.close();
    }

}
