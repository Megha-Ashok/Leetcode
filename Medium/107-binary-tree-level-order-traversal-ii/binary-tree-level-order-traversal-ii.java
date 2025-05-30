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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        Queue<TreeNode>str=new LinkedList<>();
        if(root==null)return res;
        str.add(root);
        while(!str.isEmpty()){
            int size=str.size();
            for(int i=0;i<size;i++){
                root=str.remove();
                if(root.left!=null)str.add(root.left);
                if(root.right!=null)str.add(root.right);
                arr.add(root.val);
            }
            res.add(arr);
            arr=new ArrayList<>();
        }
        Collections.reverse(res);
        return res;

    }
}