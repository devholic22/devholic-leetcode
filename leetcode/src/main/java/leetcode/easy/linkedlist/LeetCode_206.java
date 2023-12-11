package leetcode.easy.linkedlist;

public class LeetCode_206 {

    /*
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
     * SOLVED: 23.12.11
     * https://leetcode.com/problems/reverse-linked-list/
     */
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        int length = 1;
        // length를 계산해본다
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        // 만약 주어진 head가 null이었다면 null을 반환한다
        if (head == null) {
            return null;
        }
        // 왜 length - 1부터 하면 안 되고 length - 2부터만 가능한 걸까?
        ListNode result = new ListNode(getValIndex(head, length - 2));
        temp = result;
        for (int i = length - 3; i >= 0; i--) {
            temp.next = new ListNode(getValIndex(head, i));
            temp = temp.next;
        }
        return result; // result는 그대로 두면서 temp를 이동시킴..
    }

    // index번째의 val을 구하는 함수
    public int getValIndex(ListNode node, int index) {
        int count = 0;
        while (count < index && node != null) {
            node = node.next;
            count++;
        }
        if (node == null) {
            return 0;
        }
        return node.val;
    }
}
