package leetcode.easy.strings;

import java.util.Arrays;

public class LeetCode_242 {

    /**
     * SOLVED: 23.12.05
     * https://leetcode.com/problems/valid-anagram/
     */
    public boolean isAnagram(String s, String t) {
        // 각각 분할한 다음 정렬한 뒤 합친 문자열이 같은지 비교하면 된다.
        String[] sTokens = s.split("");
        String[] tTokens = t.split("");
        Arrays.sort(sTokens);
        Arrays.sort(tTokens);
        String sAnswer = String.join("", sTokens);
        String tAnswer = String.join("", tTokens);

        return sAnswer.equals(tAnswer);
    }
}
