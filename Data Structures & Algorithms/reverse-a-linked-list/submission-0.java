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

        ListNode cur = head; 

        List<Integer> lst = new ArrayList<>(); 

        while (cur != null){
            lst.add(cur.val);
            System.out.println(cur.val);
            cur = cur.next; 
        }
        
        Collections.reverse(lst); 

        ListNode tmpHead = new ListNode(0); 
        ListNode tmp = tmpHead; 

        for (int i : lst){
            tmp.next = new ListNode(i);
            tmp = tmp.next;  
        }

        return tmpHead.next; 
        
    }
}
