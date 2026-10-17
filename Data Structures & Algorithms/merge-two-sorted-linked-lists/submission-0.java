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

        if (list1 == null && list2 == null) {
            return list1;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode head;
        ListNode tmp1;
        ListNode tmp2;

        if (list1.val <= list2.val) {
            head = list1;
            tmp2 = list2;
        } else {
            head = list2;
            tmp2 = list1;
        }

        tmp1 = head.next; 

        // now compare each element in each list
        // know that head is smallest but now we check is head next smallest or tmp

        ListNode cur = head;

        ListNode prevList1 = list1; 
        ListNode prevList2 = list2; 

        while (tmp1 != null && tmp2 != null) {
            if (tmp1.val <= tmp2.val) {
                cur.next = tmp1;
                cur = tmp1; 
                tmp1 = tmp1.next; 
            } else {
                cur.next = tmp2;
                cur = tmp2;
                tmp2 = tmp2.next; 
            }
        }

        if (tmp1 != null){
            cur.next = tmp1; 
        } else if (tmp2 != null){
            cur.next = tmp2; 
        }

        return head;
    }
}