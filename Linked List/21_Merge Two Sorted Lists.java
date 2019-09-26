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
    void insertAtEnd(int x){
        ListNode new_node = new ListNode(x);
        new_node.next = null;
        tail.next = new_node;
        tail = new_node;
    }
    void insertAtBeginning(int x){
        ListNode new_node = new ListNode(x);
        new_node.next = null;
        head = new_node;
        tail = new_node;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        while(l1!=null && l2!=null){
            if(head==null){
                if(l1.val<l2.val){
                    insertAtBeginning(l1.val);
                    l1 = l1.next;
                }
                else{
                    insertAtBeginning(l2.val);
                    l2 = l2.next;
                }
            }
            else if(l1.val<l2.val){
                insertAtEnd(l1.val);
                l1 = l1.next;
            }
            else{
                insertAtEnd(l2.val);
                l2 = l2.next;
            }
        }
        while(l1!=null){
            if(head==null){
                insertAtBeginning(l1.val);
                l1 = l1.next;
            }
            else{
                insertAtEnd(l1.val);
                l1 = l1.next;
            }
        }
        while(l2!=null){
            if(head==null){
                insertAtBeginning(l2.val);
                l2 = l2.next;
            }
            else{
                insertAtEnd(l2.val);
                l2 = l2.next;
            }
        }
        return head;
    }
}