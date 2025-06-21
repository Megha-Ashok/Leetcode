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
    public ListNode mergeNodes(ListNode head) {
        ListNode ps=head.next;
        ListNode nn=new ListNode();
        head=nn;
        int count=0;
        while(ps!=null){
            count=0;
            while(ps.val!=0){
                count=count+ps.val;
                ps=ps.next;
            }
            nn.next=new ListNode(count);
            nn=nn.next;
            ps=ps.next;
        }
        return head.next;
    }
}