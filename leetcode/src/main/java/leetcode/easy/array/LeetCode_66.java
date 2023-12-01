package leetcode.easy.array;

public class LeetCode_66 {

    /**
     * SOLVED: 23.12.01
     * https://leetcode.com/problems/plus-one/
     */
    public int[] plusOne(int[] digits) {
        // 처음에는 전부 다 합한 뒤 String으로 만들고 다시 Int로 만드는 식으로 했는데, 100자리까지 가능해서 Int의 범위에 벗어난다.
        // 참고하여 풀었다. 다시 풀 법 하다.
        // 뒤에서부터 확인한다.
        for (int i = digits.length - 1; i >= 0; i--) {
            // 만약 9 미만이라면 증가시키고, digits을 반환하면 된다.
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // 9였다면 0으로 만든 뒤 이전 숫자로 넘어간다. 넘어갔다는 것은 증가되어야 한다는 거다.
            digits[i] = 0;
        }
        // 위의 반복문에서 4399 -> 4400이 정상적으로 반환된다. 여기까지 왔다는 것은 전부 9로 구성되었을 경우이다.
        digits = new int[digits.length + 1]; // 자릿수를 늘려야 한다. (9999 -> 10000)
        digits[0] = 1; // 전부 0으로 되었을 것이기에 앞의 자리를 1로 한다.
        return digits;
    }
}
