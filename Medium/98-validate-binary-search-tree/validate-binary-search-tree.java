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

    public boolean isValidBST(TreeNode root) {
        if(root.left==null && root.right==null)return true;
       return callfun(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean callfun(TreeNode root,long min,long max){
        if(root==null)return true;
        if(root.val<=min || root.val>=max)return false;
        return callfun(root.left,min,root.val) && callfun(root.right,root.val,max);
    }
}