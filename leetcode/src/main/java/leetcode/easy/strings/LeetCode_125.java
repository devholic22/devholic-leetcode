package leetcode.easy.strings;

public class LeetCode_125 {

    /**
     * SOLVED: 23.12.06
     * https://leetcode.com/problems/valid-palindrome/
     */
    public boolean isPalindrome(String s) {
        String replaced = collectOnlyAlphaNumeric(s);
        replaced = replaced.toLowerCase(); // toLowerCase, toUpperCase는 새로운 String을 반환한다.
        // replaceAll 같은 것 또한 새로운 String을 반환한다.

        StringBuilder builder = new StringBuilder(replaced.toLowerCase());
        builder.reverse();
        String reversedAnswer = builder.toString();

        return replaced.equals(reversedAnswer);
    }
    
    // 알게 된 사실: 문자 안에 특정 문자가 있는지를 정규식으로 쓰고 싶다면 대괄호를 써야 한다.
    private String collectOnlyAlphaNumeric(String s) {
        String[] tokens = s.split("");
        StringBuilder answer = new StringBuilder();
        for (String token : tokens) {
            if (token.matches("[a-zA-Z0-9]")) {
                answer.append(token);
            }
        }
        return answer.toString();
    }
}
