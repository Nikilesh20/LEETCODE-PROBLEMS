/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    node.val=node.next.val;
    node.next=node.next.next;
    }
}    

// for ex : 1,2,3,4
// head=1;
// last node=4;
// given node should be not an last node
// Now delete the 2 from the node but not the memory
// now point the value 3
// node.val=2, node.next=2
// now the node.next=node.next.next
// so it skips the 2 and results 1-> 2->4
