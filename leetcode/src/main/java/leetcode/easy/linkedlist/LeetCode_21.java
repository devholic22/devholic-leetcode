package leetcode.easy.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCode_21 {

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {

        int val;
        ListNode next;

        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    /**
     * SOLVED: 23.12.12
     * https://leetcode.com/problems/merge-two-sorted-lists/
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) { // 전부 null이면 null을 반환한다.
            return null;
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        // 값들을 넣는다.
        while (list1 != null) {
            numbers.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            numbers.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(numbers); // 알게 된 사실: ArrayList를 정렬시키려면 Collections.sort를 쓴다.

        ListNode result = new ListNode(); // 결과용 ListNode와 이동시킬 ListNode를 구분해야 한다!
        ListNode temp = result;
        for (int i = 0; i < numbers.size(); i++) {
            temp.val = numbers.get(i);
            if (i < numbers.size() - 1) { // 마지막 경우에는 next를 추가하지 않도록 해야 한다.
                temp.next = new ListNode();
            }
            temp = temp.next;
        }
        return result;
    }
}
