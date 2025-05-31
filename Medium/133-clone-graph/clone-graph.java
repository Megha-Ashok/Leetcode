/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
     if(node==null)return null;
     if(node.neighbors.isEmpty())return new Node(node.val);
     HashMap<Node,Node>arr=new HashMap<>();
     Queue<Node>que=new LinkedList<>();
     que.add(node);
     arr.put(node,new Node(node.val));
     while(!que.isEmpty()){
        Node curr=que.remove();
        for(Node nn:curr.neighbors){
            if(!arr.containsKey(nn)){
                arr.put(nn,new Node(nn.val));
                que.add(nn);
            }
            arr.get(curr).neighbors.add(arr.get(nn));
        }
     }
     return arr.get(node);
    }
}