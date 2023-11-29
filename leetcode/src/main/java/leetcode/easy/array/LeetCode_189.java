package leetcode.easy.array;

public class LeetCode_189 {

    /**
     * SOLVED: 23.11.29
     * https://leetcode.com/problems/rotate-array/
     */
    public void rotate(int[] nums, int k) {
        int[] copied = new int[nums.length];
        // O(N)으로 푸는 방법
        // 미리 값을 저장해둔다.
        for (int i = 0; i < nums.length; i++) {
            copied[i] = nums[i];
        }
        // nums[(i + k) % nums.length] = copied[i] 되도록 한다.
        // ex: nums[(0 + 3) % 7] = copied[0]
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = copied[i];
        }

        /*
        틀렸던 풀이 (시간 초과 -> nums.length와 k가 모두 10^5까지 가능하기 때문이다.)
        for (int i = 0; i < k; i++) { // k번 반복한다.
            int temp = nums[nums.length - 1]; // 맨 마지막 값을 temp에 저장해둔다.
            for (int j = nums.length - 1; j >= 0; j--) { // 뒤에서부터 오른쪽으로 한 칸씩 옮겨야 한다.
                if (j == 0) { // 만약 대상이 0번이라면 첫 번째 값을 의미하므로, 첫 번째 값에 저장해뒀던 마지막 값을 넣어둔다.
                    nums[j] = temp;
                    continue;
                }
                nums[j] = nums[j - 1]; // 그 외의 경우에는 이전 값을 저장해둔다.
            }
        }
         */
    }
}
