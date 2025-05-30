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
    //added
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>>arr=new ArrayList<>();
     Queue<TreeNode>arr1=new LinkedList<>();
     ArrayList<Integer>arr2=new ArrayList<>();
     if(root==null)return arr;
     arr1.add(root);
     while(!arr1.isEmpty()){
        int size=arr1.size();
        for(int i=0;i<size;i++){
        if(arr1.peek().left!=null)arr1.add(arr1.peek().left);
        if(arr1.peek().right!=null)arr1.add(arr1.peek().right);
         arr2.add(arr1.poll().val);
        }
        arr.add(arr2);
        arr2=new ArrayList<>();
     }
     return arr;
   
    }
}