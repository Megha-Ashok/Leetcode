/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)return null;
        ArrayList<Integer>arr=new ArrayList<>();
        while(head!=null){
           arr.add(head.val);
           if(head.child!=null)
           callfun(head.child,arr);
           head=head.next;
        }
        Node root=new Node(arr.get(0));
        Node temp=root;
        for(int i=1;i<arr.size();i++){
            Node nn=new Node(arr.get(i));
           temp.next=nn;
           nn.prev=temp;
           temp=nn;
        }
        return root;
       
    }
    public static void callfun(Node head,ArrayList<Integer>arr){
        while(head!=null){
            arr.add(head.val);
                if(head.child!=null)
                   callfun(head.child,arr);
             head=head.next; 
        }       
    }
}