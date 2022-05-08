public class OneThreeTwoPattern {
    public static boolean find132pattern(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < nums[i+1] && nums[i] < nums[i+2] && nums[i+2] < nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(find132pattern(new int[]{0,3,4,-3}));
    }
}
