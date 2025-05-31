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
    static int resSum;
    public int sumNumbers(TreeNode root) {
        resSum=0;
        callfun(root,0);
        return resSum;
    }
    public static void callfun(TreeNode root,int sum){
        if(root==null)return;
        if(root.left==null && root.right==null){
            sum=sum*10+root.val;
            resSum+=sum;
        }
        callfun(root.left,sum*10+root.val);
        callfun(root.right,sum*10+root.val);
    }
}