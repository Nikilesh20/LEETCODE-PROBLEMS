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
    public ListNode middleNode(ListNode head) {
        ListNode front=head;
        ListNode rear=head;
        while(rear!=null && rear.next!=null)
        {
            front=front.next;
            rear=rear.next.next;
        }
        return front;
    }
}