import java.util.Scanner;

/**
 * Created by Roberto on 18/05/2017.
 */
public class Java1DArrayJumpGame {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(0, leap, game);
//        return solvable(game, leap, 0);

//        int position = 0;
//        boolean canWin = false;
//
////        System.out.println("*** START ***");
//
//        while (position < game.length) {
//            if (canJump(position, leap, game)) {
//                System.out.println("JUMP " + position);
//                game[position] = 1;
//                position += leap;
//                continue;
//            }
//
//            if (canForward(position, game)) {
//                System.out.println("Move forward " + position);
//                game[position] = 1;
//                position++;
//                continue;
//            }
//
//            if (canGoBack(position, game)) {
//                System.out.println("Back " + position);
//                game[position] = 1;
//                position--;
//                continue;
//            }
//
//
//            canWin = false;
//            break;
//        }
//
//
//        if (passLastPosition(position, game)) {
//            canWin = true;
//        }
//
//        return canWin;
    }

    public static boolean passLastPosition(int position, int[] game) {
        return position > game.length - 1;
    }

    public static boolean canForward(int position, int[] game) {
        return position + 1 >= game.length || game[position + 1] == 0;
    }

    public static boolean canGoBack(int position, int[] game) {
        if (position - 1 <= 0) {
            return false;
        }

        return game[position - 1] == 0;
    }

    public static boolean canJump(int position, int leap, int[] game) {
        return position + leap >= game.length || game[position + leap] == 0;
    }

    private static boolean isSolvable(int position, int jump, int[] game) {
        if(position < 0 || game[position] == 1) return false;
        if(position + 1 >= game.length || position + jump >= game.length) return true;

        game[position] = 1;
        return isSolvable(position + jump, jump, game)
                || isSolvable(position + 1, jump, game)
                || isSolvable(position - 1, jump, game);
    }

    private static boolean solvable(int [] array, int m, int i) {
    /* Base Cases */
        if (i < 0 || array[i] == 1) {
            return false;
        } else if (i + 1 >= array.length || i + m >= array.length) {
            return true;
        }

        array[i] = 1; // marks as visited

    /* Recursive Cases */
        return solvable(array, m, i + m) ||
                solvable(array, m, i + 1) ||
                solvable(array, m, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

}
