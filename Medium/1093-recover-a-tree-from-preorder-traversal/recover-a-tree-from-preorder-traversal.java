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
    public TreeNode recoverFromPreorder(String traversal) {
     return callfun(traversal,0,new int[]{0});

    }
    public static TreeNode callfun(String traversal,int depth,int index[]){
    if(index[0]>=traversal.length())return null;
     int j=index[0];
     while(j<traversal.length()&& traversal.charAt(j)=='-'){
      j++;
     }
     if((j-index[0])!=depth)return null;
     index[0]=j;
      while(j<traversal.length()&& traversal.charAt(j)!='-'){
      j++;
     }
    int val=Integer.parseInt(traversal.substring(index[0],j));
    index[0]=j;
     TreeNode head=new TreeNode(val);
     head.left=callfun(traversal,depth+1,index);
     head.right=callfun(traversal,depth+1,index);
     return head;
    }
}