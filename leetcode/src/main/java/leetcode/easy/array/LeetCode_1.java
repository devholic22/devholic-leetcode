package leetcode.easy.array;

public class LeetCode_1 {

    /**
     * SOLVED: 23.12.02
     * https://leetcode.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // 음수가 들어올 수도 있기 때문에 nums[i] > target과 같은 경우 스킵하면 안 된다.
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
