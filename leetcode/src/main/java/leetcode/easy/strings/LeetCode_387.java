package leetcode.easy.strings;

import java.util.HashMap;

public class LeetCode_387 {

    /**
     * SOLVED: 23.12.05
     * https://leetcode.com/problems/first-unique-character-in-a-string/
     */
    public int firstUniqChar(String s) {
        // 값을 저장해 둘 해시맵을 생성한다.
        HashMap<String, Integer> map = new HashMap<>();
        String[] tokens = s.split("");
        // 해시맵에 저장한다.
        for(String token : tokens) {
            if (!map.containsKey(token)) {
                map.put(token, 1);
                continue;
            }
            map.put(token, map.get(token) + 1);
        }
        int index = 0;
        for (String token : tokens) {
            if (map.get(token) == 1) { // 하나밖에 없을 경우 해당 인덱스를 리턴한다.
                return index;
            }
            index++;
        }
        return -1; // 없을 경우 -1을 리턴한다.
    }
}
