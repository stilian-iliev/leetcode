package assessments;

import java.util.HashSet;
import java.util.Set;

public class KnightProbability {
    public static double knightProbability(int n, int k, int row, int column) {
        int[] res = calc(n, row, column, k);
        return 0;
    }

    public static int[] calc(int n, int row, int col, int k) {
        int[] stats = new int[2];
        if (k == 0) return stats;
        Set<int[]> moves = new HashSet<>();
        moves.add(new int[]{row + 2, col - 1});
        moves.add(new int[]{row + 2, col + 1});
        moves.add(new int[]{row - 2, col - 1});
        moves.add(new int[]{row - 2, col + 1});
        moves.add(new int[]{row - 1, col + 2});
        moves.add(new int[]{row + 1, col + 2});
        moves.add(new int[]{row - 1, col - 2});
        moves.add(new int[]{row + 1, col - 2});
        for (int[] move : moves) {
            stats[0]++;
            if (move[0] > 0 && move[1] > 0 && move[0] < n && move[1] < n) {
                stats[1]++;

                int[] result = calc(n, move[0], move[1], k--);
                stats[0] += result[0];
                stats[1] += result[1];

            }

        }
        return stats;
    }

    public static void main(String[] args) {
        knightProbability(3, 2, 0, 0);
    }
}
