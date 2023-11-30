package leetcode.easy.array;

import java.util.HashMap;

public class LeetCode_136 {

    /**
     * SOLVED: 23.11.30
     * https://leetcode.com/problems/single-number/
     */
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<>(); // 숫자 저장소 정의
        for (int num : nums) {
            if (numbers.containsKey(num)) { // 이미 숫자 저장소에 등록됐었다면 개수 1 증가
                numbers.put(num, numbers.get(num) + 1);
                continue;
            }
            numbers.put(num, 1);
        }
        // 저장소를 돌면서 개수가 1개인 것을 발견했을 시 num 리턴
        for (int num : numbers.keySet()) {
            if (numbers.get(num) == 1) {
                return num;
            }
        }
        return 0; // 컴파일 예외 방지
    }
}
