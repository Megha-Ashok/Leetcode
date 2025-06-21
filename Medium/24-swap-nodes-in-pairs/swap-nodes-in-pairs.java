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
  //add github
    public ListNode swapPairs(ListNode head) {
      if(head==null || head.next==null)return head;
    ListNode prev;
    ListNode cur=head;
    ListNode fast=head;
    ListNode linker=null;
   while(fast!=null && fast.next!=null){
    prev=fast;
    cur=fast.next;
    fast=fast.next.next;
    if(prev==head){
      cur.next=prev;
      prev.next=fast;
      head=cur;
    }
    else{
      cur.next=prev;
      prev.next=fast;
      linker.next=cur;
    }
    linker=prev;
   }
   return head;
    }
}