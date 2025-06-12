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
    static int count;
    static int node;
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        callfun(root,k);
        return node;
    }
    public static void callfun(TreeNode root,int k){
        if(root==null)return;
        callfun(root.left,k);
        count++;
        if(count==k){
            node=root.val;
         return;
        }
        callfun(root.right,k);
    }
}