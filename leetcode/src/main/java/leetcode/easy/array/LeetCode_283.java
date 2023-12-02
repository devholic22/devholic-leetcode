package leetcode.easy.array;

import java.util.ArrayList;

public class LeetCode_283 {

    /**
     * SOLVED: 23.12.02
     * https://leetcode.com/problems/move-zeroes/
     */
    public void moveZeroes(int[] nums) {
        // array를 copy하면 안 된다. 그래서 반환 타입도 void이다.
        // 단, 값을 복사하는 것은 문제 없다. 따라서 0이 아닐 때는 list에 넣고, 0의 개수만큼 마지막에 0을 넣으면 된다. 그리고 값을 복사시킨다.
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;
                continue;
            }
            list.add(num);
        }
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}
