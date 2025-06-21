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
    public ListNode doubleIt(ListNode head) {
      head=reverse(head);
      ListNode temp=head;
      int flag=0;
      while(temp!=null){
        temp.val=(temp.val)*2;
        if(flag==1){
            temp.val=temp.val+1;
            flag=0;
        }
        if(temp.val>9){
            flag=1;
            temp.val=temp.val%10;
        }
        if(temp.next==null && flag==1){
            temp.next=new ListNode(1);
            break;
        }
        temp=temp.next;
      }
      ListNode result=reverse(head);
      return result;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        ListNode cur=head;
        while(temp!=null){
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}