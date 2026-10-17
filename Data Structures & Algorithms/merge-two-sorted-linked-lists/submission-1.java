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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // for each head find out what should come next

        ListNode dummy = new ListNode(); 
        ListNode cur = dummy; 

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                cur = list1; 
                list1 = list1.next; 
            } else {
                cur.next = list2;
                cur = list2;
                list2 = list2.next; 
            }
        }

        if (list1 != null){
            cur.next = list1; 
        } else if (list2 != null){
            cur.next = list2; 
        }

        return dummy.next;
    }
}