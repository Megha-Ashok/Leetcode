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
    static HashMap<Integer,Integer>inMap;
    //added
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length!=inorder.length)return null;
        inMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
        TreeNode root=build(postorder,0,postorder.length-1,inorder,0,inorder.length);
        return root;
    }
   public static TreeNode build(int preorder[],int preStart,int preEnd,int inorder[],int inStart,int inEnd){
         if(preStart>preEnd || inStart>inEnd)return null;
         TreeNode root=new TreeNode(preorder[preEnd]);
         int inRoot=inMap.get(preorder[preEnd]);
         int numleft=inRoot-inStart;
         root.left=build(preorder,preStart,preStart+numleft-1,inorder,inStart,inRoot-1);
         root.right=build(preorder,preStart+numleft,preEnd-1,inorder,inRoot+1,inEnd);
        return root;
   }
}