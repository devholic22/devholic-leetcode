package leetcode.easy.strings;

public class LeetCode_28 {

    /**
     * SOLVED: 23.12.07
     * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
     */
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle); // 자동으로 존재하지 않을 시 -1 반환함
        /*
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
        */
    }
}
