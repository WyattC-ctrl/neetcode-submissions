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

        //use a hashset instead and this can store everything you have already seen 

        // can use a fast and slow node since if there is a cycle fast will evntually reach slow

        ListNode fast = head; 
        ListNode slow  = head; 

        while (fast != null && fast.next != null){

            slow = slow.next; 
            fast = fast.next.next; 

            if (slow == fast){
                return true; 
            }

        }

        return false; 
    }
}
