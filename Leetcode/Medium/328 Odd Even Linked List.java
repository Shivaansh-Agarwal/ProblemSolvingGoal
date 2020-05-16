/*
    328. Odd Even Linked List (Medium)
    https://leetcode.com/problems/odd-even-linked-list/
    16/05/2020
    May LeetCoding Challenge
    Day-16
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        // if there's 1 or 2 elements.
        if(head==null || head.next==null || head.next.next==null)
            return head;
        ListNode evenHead = head.next;
        ListNode ptr = head;
        ListNode evenPtr = ptr.next;
        ptr.next = ptr.next.next;
        ptr = ptr.next;
        while(ptr.next!=null && ptr.next.next!=null){
            evenPtr.next = ptr.next;
            evenPtr = evenPtr.next;
            ptr.next = ptr.next.next;
            ptr = ptr.next;
        }
        if(ptr.next==null){
            ptr.next = evenHead;
            evenPtr.next = null;
        } else if(ptr.next.next==null){
            evenPtr.next = ptr.next;
            evenPtr = evenPtr.next;
            evenPtr.next = null;
            ptr.next = evenHead;
        }
        return head;
    }
}