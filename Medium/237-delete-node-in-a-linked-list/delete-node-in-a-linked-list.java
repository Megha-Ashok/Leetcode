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
      ListNode head=node;
      ListNode prev=null;
        while(head!=null&& head.next!=null) {
          prev=head;
          head.val=head.next.val;
          head=head.next;
        } 
        if(prev!=null){
          prev.next=null;
        }
    }
}