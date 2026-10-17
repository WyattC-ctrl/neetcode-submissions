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
    public boolean hasCycle(ListNode head) {
        // track if a node that has already been seen points to prvious

        // a cycle would have to be in the tail position since can only have one next

        // change the value of the node to its index and if the inde if ever less than what you got
        // the return false

        int count = 0;

        ListNode dummy = head;

        while (dummy != null) {
            
            if (dummy.val == -1001){
                return true;
            }
            
            dummy.val = -1001;

            dummy = dummy.next;
        }

        return false;
    }
}
