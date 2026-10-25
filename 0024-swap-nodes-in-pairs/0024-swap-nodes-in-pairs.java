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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode newHead = head.next;
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null && current.next != null) {
            ListNode x = current;        
            ListNode y = current.next;  
            
            x.next = y.next;
            y.next = x;
            
            if (prev != null) {
                prev.next = y;
            }
            
            prev = x;
            current = x.next;
        }
        return newHead;
    }
}
