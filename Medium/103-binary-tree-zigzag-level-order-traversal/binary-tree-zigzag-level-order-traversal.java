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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>arr=new ArrayList<>();
        ArrayList<Integer>arr1=new ArrayList<>();
        Queue<TreeNode>str=new LinkedList<>();
        if(root==null)return arr;
        int flag=0;
        str.add(root);
        while(!str.isEmpty()){
            int size=str.size();
            for(int i=0;i<size;i++){
                root=str.remove();
                if(root.left!=null)str.add(root.left);
                if(root.right!=null)str.add(root.right);
                arr1.add(root.val);
            }
            if(flag==0){
                arr.add(arr1);
                flag=1;
            }
            else{
                Collections.reverse(arr1);
                arr.add(arr1);
                flag=0;
            }
            arr1=new ArrayList<>();
        }
        return arr;
    } 
}