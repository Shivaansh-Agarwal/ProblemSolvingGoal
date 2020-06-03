/*
    237. Delete Node in a Linked List
    https://leetcode.com/problems/delete-node-in-a-linked-list/
    02/06/2020
    June Leetcoding Challenge
    Day-2

    O(n)
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
    public void deleteNode(ListNode node) {
        while(true){
            node.val = node.next.val;
            if(node.next.next==null){
                node.next=null;
                break;
            }
            node = node.next;
            
        }
    }
}