package leetcode.easy.array;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode_350 {

    /**
     * SOLVED: 23.12.01
     * https://leetcode.com/problems/intersection-of-two-arrays-ii/
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        // 1. nums1에서 각 숫자가 몇 개 있는지 기록한다.
        // 2. nums2에서 각 숫자가 몇 개 있는지 기록한다.
        // 3. 0부터 1000까지 돌면서, nums1과 nums2에서 전부 0개가 있었다면 넘기고 둘 중에서 하나라도 0개가 있었어도 넘긴다.
        // 4. 같은 숫자를 기록한 것 중 더 적은 사이즈만큼 해당 숫자를 저장한다.

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i <= 1000; i++) {
            map1.put(i, 0);
            map2.put(i, 0);
        }
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.get(nums1[i]) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], map2.get(nums2[i]) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            if (map1.get(i) == 0 || map2.get(i) == 0) {
                continue;
            }
            int size = Math.min(map1.get(i), map2.get(i));
            for (int j = 0; j < size; j++) {
                result.add(i);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
