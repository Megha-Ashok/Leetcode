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
  //add to github
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        count=count-n-1;
    if(count==-1)return head.next;
      ListNode temp1=head;
        while(count>0 && temp1!=null){
            temp1=temp1.next;
            count--;
        }
        if(temp1!=null  && temp1.next!=null){
            temp1.next=temp1.next.next;
        }
        return head;
    }
}