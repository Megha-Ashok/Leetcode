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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next==null)return head;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        k=k%count;
        count=count-k-1;
        ListNode temp1=head;
        while(count>=1 && temp1!=null){
         temp1=temp1.next;
         count--;
         }
         ListNode nn=temp1.next;
         ListNode temp2=nn;
         temp1.next=null;
         if(nn==null)return head;
         while(nn.next!=null){
            nn=nn.next;
         }
         nn.next=head;
         return temp2;

    }
}