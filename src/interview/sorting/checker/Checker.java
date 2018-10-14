package interview.sorting.checker;

import java.util.Comparator;

/**
 * @author Roberto on 14/10/2018
 */
public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {

        int compareScore = Integer.compare(p2.score, p1.score);

        if (compareScore == 0) {
            return p2.name.compareTo(p1.name);
        }

        return compareScore;
    }
}
