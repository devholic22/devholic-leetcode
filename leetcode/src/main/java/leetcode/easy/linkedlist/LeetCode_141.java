package leetcode.easy.linkedlist;

import java.util.ArrayList;

public class LeetCode_141 {

    /**
     * Definition for singly-linked list.
     */
    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        // 사이즈를 고려하면 된다.
        // 제공된 사이즈는 10^4 (10000) 까지이기 때문에, 이를 넘는다면 cycle인 것이다.
        ArrayList<Integer> numbers = new ArrayList<>();
        while (head != null) {
            numbers.add(head.val);
            if (numbers.size() > 10000) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
