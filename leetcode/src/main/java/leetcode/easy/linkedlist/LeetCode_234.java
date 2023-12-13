package leetcode.easy.linkedlist;

import java.util.ArrayList;

public class LeetCode_234 {

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
     * SOLVED: 23.12.13
     * https://leetcode.com/problems/palindrome-linked-list/
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) { // 만약 null이 들어오면 false 처리
            return false;
        }
        // 사이즈 계산
        int length = 0;
        ListNode test = head;
        while (test != null) {
            test = test.next;
            length++;
        }
        int half = length / 2;
        test = head; // 처음에 head로 타겟팅

        ArrayList<Integer> prevNumbers = new ArrayList<>();
        ArrayList<Integer> afterNumbers = new ArrayList<>();
        for (int i = 0; i < half; i++) {
            prevNumbers.add(test.val); // 절반 이전 값 넣기
            test = test.next;
        }
        if (length % 2 != 0) { // 만약 홀수라면 한 번 전진시킴
            test = test.next;
        }
        for (int i = 0; i < half; i++) {
            afterNumbers.add(test.val); // 절반 이후 값 넣기
            test = test.next;
        }

        // 결과를 판단하기 위한 StringBuilder 이용
        StringBuilder prevAnswer = new StringBuilder("");
        StringBuilder afterAnswer = new StringBuilder("");
        for (int i = 0; i < prevNumbers.size(); i++) {
            prevAnswer.append(String.valueOf(prevNumbers.get(i)));
        }
        for (int i = 0; i < afterNumbers.size(); i++) {
            afterAnswer.append(String.valueOf(afterNumbers.get(i)));
        }

        return prevAnswer.toString().equals(afterAnswer.reverse().toString());
    }
}
