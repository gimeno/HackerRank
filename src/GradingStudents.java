import java.util.Scanner;

/**
 * Created by Roberto on 01/03/2018.
 */
public class GradingStudents {
    static int[] solve(int[] grades){

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                if ((grades[i] + 1) % 5 == 0) {
                    grades[i] = grades[i] + 1;
                } else if ((grades[i] + 2) % 5 == 0) {
                    grades[i] = grades[i] + 2;
                }
            }
        }

        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
