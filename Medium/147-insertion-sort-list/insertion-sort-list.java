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
    public ListNode insertionSortList(ListNode head) {
       ArrayList<Integer>arr=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
        arr.add(temp.val);
        temp=temp.next;
       }
       Collections.sort(arr);
      ListNode n2=head;
       for(int i=0;i<arr.size();i++){
        n2.val=arr.get(i);
        n2=n2.next;
       }
       return head;
    }
    
}