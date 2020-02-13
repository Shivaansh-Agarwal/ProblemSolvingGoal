/*
    1290. Convert Binary Number in a Linked List to Integer
    https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

    Date: 13-02-2020
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode trav = head;
        int count = 0;
        // Counting the number of digits in the binary number
        while(trav!=null){
            count++;
            trav = trav.next;
        }
        int ans = 0;
        ListNode trav2 = head;
        while(--count>=0 && trav2!=null){
            ans += trav2.val*((int)Math.pow(2,count));
            trav2 = trav2.next;
        }
        return ans;
    }
}