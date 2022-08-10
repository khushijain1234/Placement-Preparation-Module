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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        
        ListNode curr=head;
        ListNode rightEnd=null,rightHead=null;
        
        int c=0,n=0;
        while(curr!=null){
            rightEnd=curr;
            n++;
            curr=curr.next;
        }
        
            k=k%n;
        
        if(k==0) return head;
        curr=head;
        while(c<n-k-1 && curr!=null){
            c++;
            curr=curr.next;
        }
        rightHead=curr.next;
        curr.next=null;
        
        if(rightEnd!=null)
            rightEnd.next=head;
    
        return rightHead;
    }
}
