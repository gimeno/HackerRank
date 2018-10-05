import java.util.Scanner;

/**
 * Created by Roberto on 03/03/2018.
 */
public class ThePowerSum {
    static int powerSum(int X, int N, int num) {
        if(Math.pow(num,N)<X)
            return powerSum(X,N,num+1)+powerSum(X - new Double(Math.pow(num, N)).intValue(),N,num+1);
        else if(Math.pow(num,N)==X)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N, 1);
        System.out.println(result);
        in.close();
    }
}
