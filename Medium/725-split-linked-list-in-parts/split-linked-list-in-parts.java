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
    public ListNode[] splitListToParts(ListNode head, int k) {
    ListNode temp=head;
    int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode result[]=new ListNode[k];
        int i=0;
        if(count<=k){
            while(head!=null){
            ListNode nn=new ListNode(head.val);
            result[i++]=nn;
            head=head.next;
            }
            return result;
        }
        int minNode=count/k;
        int extra=count%k;
         temp=head;
        while(temp!=null){
           ListNode ans1=new ListNode(-1);
           ListNode nn=ans1;
           if(extra>0){
            nn.next=temp;
            nn=temp;
            temp=temp.next;
            extra--;
           }
           count=0;
           while(count<minNode){
             nn.next=temp;
             temp=temp.next;
             nn=nn.next;
             count++;
           }
           nn.next=null;
           result[i++]=ans1.next;
        }
    
        return result;
    }
}