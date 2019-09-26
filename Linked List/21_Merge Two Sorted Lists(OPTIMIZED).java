/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode head = null;
    ListNode tail = null;
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        else if(l1==null && l2!=null)
            return l2;
        else if(l1!=null && l2==null)
            return l1;
        // For first element
        if(l1.val<l2.val){
            head = l1;
            tail = l1;
            l1 = l1.next;
        }
        else{
            head = l2;
            tail = l2;
            l2 = l2.next;
        }
        //For remaining elements.
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
        if(l1!=null)
            tail.next = l1;
        else if(l2!=null)
            tail.next = l2;
        return head;
    }
}