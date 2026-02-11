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
    public boolean isPalindrome(ListNode head) {
        if(head==null) 
            return true;
        ListNode copy=null;
        ListNode temp=head;
        while(temp!=null) 
        {
            ListNode newNode=new ListNode(temp.val);
            newNode.next=copy;
            copy=newNode;
            temp=temp.next;
        }
        while(head!=null && copy!=null) 
        {
            if(head.val!=copy.val)
                return false;
            head=head.next;
            copy=copy.next;
        }
        return true;
    }
}