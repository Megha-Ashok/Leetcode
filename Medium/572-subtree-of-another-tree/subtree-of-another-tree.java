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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return callfun(root,subRoot);
    }
    public static boolean callfun(TreeNode root, TreeNode subRoot){
      if(root==null)return false;
      if(root.val==subRoot.val){
        if(findStructure(root,subRoot))return true;
      }
      return callfun(root.left,subRoot)||callfun(root.right,subRoot);
    }
    public static boolean findStructure(TreeNode root,TreeNode subRoot){
      if(subRoot==null && root==null)return true;
      if(root==null || subRoot==null)return false;
      if(root.val!=subRoot.val)return false;
      return findStructure(root.left,subRoot.left)&& findStructure(root.right,subRoot.right);
    }
}