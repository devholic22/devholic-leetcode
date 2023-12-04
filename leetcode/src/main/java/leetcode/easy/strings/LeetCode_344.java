package leetcode.easy.strings;

public class LeetCode_344 {

    /**
     * SOLVED: 23.12.04
     * https://leetcode.com/problems/reverse-string/
     */
    public void reverseString(char[] s) {
        /*
        StringBuilder builder = new StringBuilder(new String(s));
        String reversed = builder.reverse().toString();
        s = reversed.toCharArray(); 실수한 내용: 자바에서는 이렇게 할당해봤자 값이 갱신되지 않는다.
        */
        char temp;
        for (int i = 0; i < s.length; i++) {
            if (i < s.length / 2) { // 절반보다 작을 때 까지만 진행해야 한다. 같은 경우도 포함시키면 [0, 1, 2, 3]일 때 인덱스 2가 인덱스 1과 또 교환된다.
                temp = s[i];
                s[i] = s[s.length - i - 1];
                s[s.length - i - 1] = temp;
            }
        }
    }
}
