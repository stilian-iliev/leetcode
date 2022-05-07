package assessments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LargestTimeFromDigits {
    public static String largestTimeFromDigits(int[] arr) {
        List<int[]> combinations = new ArrayList<>();

        for (int h1 = 0; h1 < arr.length; h1++) {
            for (int h2 = 0; h2 < arr.length; h2++) {
                if (h1 == h2) continue;
                for (int m1 = 0; m1 < arr.length; m1++) {
                    if (m1 == h2 || m1 == h1) continue;
                    for (int m2 = 0; m2 < arr.length; m2++) {
                        if (m1 == m2 || m2 == h2 || m2 == h1) continue;
                        int hour = Integer.parseInt(String.valueOf(arr[h1]) + String.valueOf(arr[h2]));
                        int mins = Integer.parseInt(String.valueOf(arr[m1]) + String.valueOf(arr[m2]));
                        combinations.add(new int[]{hour,mins});
                    }
                }
            }
        }

        combinations.removeIf(combination -> combination[0] >= 24 || combination[1] >= 60);
        if (combinations.isEmpty()) return "";

        combinations = combinations.stream().sorted((r,l) -> l[0] - r[0]).limit(2).collect(Collectors.toList());

        if (combinations.size() == 2 && combinations.get(0)[0] == combinations.get(1)[0]) {
            combinations.sort((r, l) -> l[1] - r[1]);
        }

        return String.format("%02d:%02d%n",combinations.get(0)[0], combinations.get(0)[1]);
    }

    public static void main(String[] args) {
        System.out.println(largestTimeFromDigits(new int[]{9,3,4,2}));
    }
}
