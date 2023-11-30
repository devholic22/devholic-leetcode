package leetcode.easy.array;

import java.util.Arrays;

public class LeetCode_217 {

    /**
     * SOLVED: 23.11.30
     * https://leetcode.com/problems/contains-duplicate/
     */
    public boolean containsDuplicate(int[] nums) {
        // 중복을 제거한 배열의 사이즈와 원래 사이즈가 같은지를 이용하면 된다.
        int[] uniqueNums = Arrays.stream(nums) // LeetCode에서 문제를 풀 때는 import 코드를 작성하지 않아도 된다.
                .distinct()
                .toArray(); // 새로 알게 된 사실: int 등 primitive type에 대해서는 toArray를 적용한다.

        return uniqueNums.length != nums.length;
    }
}
