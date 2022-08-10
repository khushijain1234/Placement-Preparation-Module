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
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        curr=head;
        int k=size-n;
        while(k-->1){
            curr=curr.next;
        }
        if(curr.next.next!=null)
        curr.next=curr.next.next;
        else
            curr.next=null;
        
        return head;
    }
}
