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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer>arr=new ArrayList<>();
        Stack<Integer>stk=new Stack<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int result[]=new int[arr.size()];
       for(int i=arr.size()-1;i>=0;i--){
        result[i]=0;
        while(!stk.isEmpty() && stk.peek()<=arr.get(i)){
          stk.pop();
        }
        if(!stk.isEmpty())result[i]=stk.peek();
        stk.push(arr.get(i));
       }
        return result;

    }
}
/*
while(head!=null){
            ListNode temp=head.next;
            while(temp!=null){
              if(temp.val>head.val){
                arr.add(temp.val);
                break;
              }
              temp=temp.next;
            }
            if(temp==null)arr.add(0);
            head=head.next;
        }
        int result[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        return result;
        */