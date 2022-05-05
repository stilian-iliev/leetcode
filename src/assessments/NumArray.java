package assessments;

import java.util.LinkedHashMap;
import java.util.Map;

class NumArray {
    private final int[] arr;
    private final Map<int[], Integer> sums;

    public NumArray(int[] nums) {
        arr = nums;
        sums = new LinkedHashMap<>();
    }

    public void update(int index, int val) {
        if (arr[index] != val)
        arr[index] = val;
    }

    public int sumRange(int left, int right) {
        if (sums.get(new int[]{left,right}) != null) return sums.get(new int[]{left,right});
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += arr[i];
        }
        sums.put(new int[]{left, right}, sum);
        return sum;
    }
}
