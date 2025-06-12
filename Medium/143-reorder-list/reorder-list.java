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
      if(head==null || head.next==null)return;
      ListNode mid=findmid(head);
      ListNode reversed=reverse(mid);
      merge(head,reversed);
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            temp=temp.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public ListNode findmid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
   
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public void merge(ListNode l1,ListNode l2){
    while(l2.next!=null){
       ListNode l11=l1.next;
       ListNode l22=l2.next;
       l1.next=l2;
       l2.next=l11;
       l1=l11;
       l2=l22;
    }
    }
}