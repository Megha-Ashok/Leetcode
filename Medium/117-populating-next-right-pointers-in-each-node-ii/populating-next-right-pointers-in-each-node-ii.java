/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         if(root==null)return null;
        Queue<Node>res=new LinkedList<>();
        res.add(root);
        Node temp=null;
        while(!res.isEmpty()){
            int size=res.size();
            for(int i=0;i<size;i++){
                Node nn=res.remove();
                if(temp==null)temp=nn;
                else {
                    temp.next=nn;
                    temp=nn;
                }
                if(nn.left!=null)res.add(nn.left);
               if(nn.right!=null) res.add(nn.right);
            }
            temp.next=null;
            temp=null;
        }
        return root;
    }
}