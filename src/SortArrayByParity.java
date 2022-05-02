import java.util.Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .sorted((l,r) -> Integer.compare(l%2, r%2))
                .mapToInt(e->e)
                .toArray();
    }
}
