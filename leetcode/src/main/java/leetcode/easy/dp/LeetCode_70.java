package leetcode.easy.dp;

public class LeetCode_70 {

    /**
     * SOLVED: 23.12.16
     * https://leetcode.com/problems/climbing-stairs/
     */
    public int climbStairs(int n) {
        // 1 또는 2만 활용
        // 1: 1
        // 2: 2
        // 3: 3
        // 4: 5
        // F(n): F(n - 1) + F(n - 2)
        if (n <= 3) {
            return n;
        }
        int[] numbers = new int[46];
        numbers[1] = 1;
        numbers[2] = 2;
        for (int i = 3; i <= n; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[n];
    }
}
