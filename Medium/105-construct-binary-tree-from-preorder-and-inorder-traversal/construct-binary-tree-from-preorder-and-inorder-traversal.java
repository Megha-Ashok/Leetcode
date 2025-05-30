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
    static HashMap<Integer,Integer>inMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root=build(preorder,0,preorder.length-1,inorder,0,inorder.length);
        return root;
    }
   public static TreeNode build(int preorder[],int preStart,int preEnd,int inorder[],int inStart,int inEnd){
         if(preStart>preEnd || inStart>inEnd)return null;
         TreeNode root=new TreeNode(preorder[preStart]);
         int inRoot=inMap.get(root.val);
         int numleft=inRoot-inStart;
         root.left=build(preorder,preStart+1,preStart+numleft,inorder,inStart,inEnd-1);
         root.right=build(preorder,preStart+numleft+1,preEnd,inorder,inStart+numleft+1,inEnd);
        return root;
   }

}