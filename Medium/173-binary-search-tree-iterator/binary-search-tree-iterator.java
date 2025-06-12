/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
   ArrayList<Integer>arr;
    int i;
    public BSTIterator(TreeNode root) {
        arr=new ArrayList<>();
        callfun(root);
        i=-1;
    }
    
    public int next() {
        i++;
      return arr.get(i);
    }
    
    public boolean hasNext() {
      if(i!=arr.size()-1)return true;
      return false;
    }
    public void callfun(TreeNode root){
       if(root==null)return;
       callfun(root.left);
       arr.add(root.val);
       callfun(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */