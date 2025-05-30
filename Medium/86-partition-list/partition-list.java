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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(0);
        ListNode temp1=dummy;
        ListNode dummy1=new ListNode(0);
        ListNode temp2=dummy1;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x)
            {
                temp1.next=temp;
                temp1=temp;
            }
            else{
                temp2.next=temp;
                temp2=temp;
            }
            temp=temp.next;
        }
        temp1.next=null;
        temp2.next=null;
        temp1.next=dummy1.next;
        return dummy.next;
   
    }
}