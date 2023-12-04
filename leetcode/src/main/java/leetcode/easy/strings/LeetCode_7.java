package leetcode.easy.strings;

public class LeetCode_7 {

    /**
     * SOLVED: 23.12.04
     * https://leetcode.com/problems/reverse-integer/
     */
    public int reverse(int x) {
        int value = Math.abs(x); // 절댓값을 구한다.
        StringBuilder builder = new StringBuilder(String.valueOf(value));
        String answer = builder.reverse().toString(); // 반전시킨다.
        try {
            if (x < 0) { // 음수였을 경우 -1 * 파싱 값을 반환한다.
                return -1 * Integer.parseInt(answer);
            } // 양수였을 경우 파싱 값을 반환한다.
            return Integer.parseInt(answer);
        } catch (NumberFormatException exception) { // 예외 발생 시 0을 반환한다. int 반환임이 명시되어 있다. expected를 통해 알았다.
            return 0;
        }
    }
}
