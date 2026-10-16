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
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null){
            return head; 
        }

        // we know that for each tmp previous so instead stroe the last element

        ListNode prev = head; 
        ListNode cur = head.next; 
        prev.next = null; 
        ListNode nxt;

        while (cur != null){
            nxt = cur.next; 
            cur.next = prev; 
            prev = cur;
            cur = nxt; 
        }

        return prev; 
        
    }
}
