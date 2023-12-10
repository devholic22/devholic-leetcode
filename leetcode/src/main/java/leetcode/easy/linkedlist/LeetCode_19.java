package leetcode.easy.linkedlist;

public class LeetCode_19 {

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
     * SOLVED: 23.12.10
     * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        // 전체 개수 (length)를 파악한다.
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        // 만약 전체 개수가 1개였다면 그냥 빈 ListNode를 반환하면 된다.
        if (length == 1) {
            return null;
        }
        /*
        아래 while문에 의해 적용된다.
        if (length == 2 && n == 1) {
            head.next = null;
            return head;
        }
        */
        // 만약 전체 개수와 n이 같다면 맨 첫 번째 값을 없애면 된다.
        if (length == n) {
            head = head.next;
            return head;
        }
        int position = 0; // 이동된 위치
        ListNode node = head; // 작업하기 위한 ListNode 복사본
        while (true) {
            // ex: position이 2, length가 5, n이 2일 때 2 = 5 - 2 - 1
            if (position == length - n - 1) {
                node.next = node.next.next; // 이때 node의 값은 3 (2번째 인덱스)
                break;
            }
            // 한 칸씩 이동
            node = node.next;
            position++;
        }
        return head; // 참조 개념이라 head를 직접 다루지 않고 head를 복사한 node에서도 작업할 수 있는 것 같다.
    }
}
