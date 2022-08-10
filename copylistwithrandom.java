/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (head.next == null && head.random == null) return new Node(head.val);
        
        Node curr = head, next, newNode;
        
        // we're effectively copying the linkedList without randoms attached and inserting
        // the new nodes inbetween the old ones
        while (curr != null) {
            next = curr.next;
            newNode = new Node(curr.val);
            curr.next = newNode;
            newNode.next = next;
            curr = curr.next.next;
        }
        
        // Now we're going to iterate through and connect the randoms
        curr = head;
        while (curr != null) {
            next = curr.next;
            // we can set our copied (which is the next element of the original) 's random to 
            // the original's random, but the next element (because thats a copy of the orignal random)
            if (curr.random != null) {
                next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        
        // now we need to break apart the two lists
        curr = head;
        newNode = head.next;
        while (curr != null && curr.next != null) {
            next = curr.next;
            curr.next = curr.next.next;
            // this looks terrible, but it does make sense...
            if (next.next != null) {
                next.next = next.next.next;
            } else next.next = null;
            curr = curr.next;
        }
        return newNode;
    }
}
