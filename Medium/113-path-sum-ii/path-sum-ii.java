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
    static List<List<Integer>>res;
    //added
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        callfun(root,targetSum,arr);
        return res;
    }
    public static void callfun(TreeNode root,int targetSum,ArrayList<Integer>arr){
       if(root==null)return;
        arr.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum==root.val){
                res.add(new ArrayList<>(arr));
            }
        }
        callfun(root.left,targetSum-root.val,arr);
        callfun(root.right,targetSum-root.val,arr);
        arr.remove(arr.size()-1);
    }
}