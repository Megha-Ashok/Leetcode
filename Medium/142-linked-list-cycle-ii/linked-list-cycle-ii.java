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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode fast=head.next.next;
        ListNode slow=head.next;
        while(fast!=null && fast.next!=null && slow!=fast){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null || fast.next==null)return null;
        System.out.println(slow.val);
        while(head!=slow){
            head=head.next;
            slow=slow.next;
        }
        return head;

    }
}