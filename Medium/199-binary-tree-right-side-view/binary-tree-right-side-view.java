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
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
      ArrayList<Integer>res=new ArrayList<>();
      if(root==null)return res;
      Queue<TreeNode>arr=new LinkedList<>();
      arr.add(root);
      while(!arr.isEmpty()){
          int size=arr.size();
          for(int i=1;i<=size;i++){
            TreeNode temp=arr.remove();
            if(i==size)res.add(temp.val);
            if(temp.left!=null)arr.add(temp.left);
            if(temp.right!=null)arr.add(temp.right);
          }
      } 
      return res;
    }
}