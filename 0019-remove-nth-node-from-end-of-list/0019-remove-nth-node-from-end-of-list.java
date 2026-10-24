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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l=0;
        ListNode temp= new ListNode();
        temp= head;
        while(temp!=null){
            temp= temp.next;
            l+=1;
        }
        temp= head;
        if(l==n)
        return head.next;
        for(int i=0; i<(l-n); i++){
            if(i==l-n-1){
                temp.next= temp.next.next;
            }
            else
            temp= temp.next;
        }
        
        return head;
    }
}