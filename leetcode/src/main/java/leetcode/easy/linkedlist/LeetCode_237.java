package leetcode.easy.linkedlist;

public class LeetCode_237 {

    /**
     * Definition for singly-linked list.
     */
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
      }

    /**
     * SOLVED: 23.12.09
     * https://leetcode.com/problems/delete-node-in-a-linked-list/
     */
    public void deleteNode(ListNode node) {
        // 데이터가 주어진 형태가 이상하긴 하지만, 다음 값의 데이터를 가져오는 형태로 하면 없어지긴 한다.
        // 좋은 문제는 아닌 것 같다. 원래 node가 가지고 있던 next가 그대로 남아있기 때문이다.
        node.val = node.next.val;
        node.next = node.next.next;

        // [4, 5, 1, 9], 5일 경우
            // 4 -> 1 -> 1 -> 9로 값이 저장되고
            // 4 -> 1 -> 9로 바라보게 된다. (이때 기존 1은 여전히 9를 바라본다.)
        // 즉 나는 5를 기준으로 없애고 싶은데 이 문제는 그 다음 값을 없애는 방식을 택했다.
    }
}
