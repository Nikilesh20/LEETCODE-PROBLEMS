/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode front=head;
        ListNode rear=head;
        while(rear!=null && rear.next!=null)
        {
            front=front.next;
            rear=rear.next.next;
            if(front==rear)
              return true;
        }
        return false;
    }
}