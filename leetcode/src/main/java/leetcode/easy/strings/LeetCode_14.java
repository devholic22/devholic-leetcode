package leetcode.easy.strings;

public class LeetCode_14 {

    /**
     * SOLVED: 23.12.08
     * https://leetcode.com/problems/longest-common-prefix/
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder("");
        int index = Integer.MAX_VALUE;
        for (String str : strs) {
            index = Math.min(index, str.length()); // 가장 작은 길이를 가진 배열의 길이를 파악한다.
        }

        for (int i = 0; i < index; i++) { // 가장 작은 길이를 가진 배열의 길이만큼만 진행한다.
            boolean same = true; // 모두 다 같은 요소를 가진다고 가정한다.
            String target = strs[0].split("")[i]; // 0번째의 i번째 값으로 예측값을 설정한다. strs[0]의 길이는 index보다 크거나 같다.
            for (String str : strs) {
                if (!str.split("")[i].equals(target)) { // 만약 달라진 지점이 있다면 현재까지의 결과를 출력한다.
                    same = false;
                    return result.toString();
                }
            }
            if (same) { // 모두 공통되게 가지고 있다면 값을 저장한다.
                result.append(target);
            }
        }
        return result.toString();
    }
}
