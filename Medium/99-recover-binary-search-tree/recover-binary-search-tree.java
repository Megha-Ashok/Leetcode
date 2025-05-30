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
    static ArrayList<Integer>arr;
    static TreeNode cur;
    static int i;
    //added
    public void recoverTree(TreeNode root) {
        arr=new ArrayList<>();
        callfun(root);
        Collections.sort(arr);
        cur=root;
        i=0;
        callfun1(root);
    }
    public static void callfun(TreeNode root){
        if(root==null)return;
        callfun(root.left);
        arr.add(root.val);
        callfun(root.right);
    }
    public static void callfun1(TreeNode root){
         if(root==null)return;
        callfun1(root.left);
        if(root.val!=arr.get(i)){
            root.val=arr.get(i++);
        }
        else{
            i++;
        }
        callfun1(root.right);
    }
}