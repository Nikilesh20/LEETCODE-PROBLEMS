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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode next=null;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null)
        {
            ListNode a=first.next;
            ListNode b=second.next;
            first.next=second;
            second.next=a;
            first=a;
            second=b;
        }
    }
}