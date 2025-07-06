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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Queue<TreeNode>que=new LinkedList<>();
        que.add(root);
        ArrayList<TreeNode>arr=new ArrayList<>();
        HashMap<TreeNode,TreeNode>hash=new HashMap<>();
        hash.put(root,new TreeNode(-1));
        while(!que.isEmpty()){
          int size=que.size();
          for(int i=0;i<size;i++){
            TreeNode temp=que.remove();
            arr.add(temp);
            if(temp.left!=null){
              que.add(temp.left);
              hash.put(temp.left,temp);
            }
            if(temp.right!=null){
              que.add(temp.right);
              hash.put(temp.right,temp);
            }
          }
          if(que.size()>0){
            arr=new ArrayList<>();
          }
        }
        ArrayList<TreeNode>temp=new ArrayList<>();
        if(arr.size()==1)return arr.get(0);
        if(arr.size()==0)return null;
        while(true){
          int size=arr.size();
          for(int i=0;i<size;i++){
          TreeNode nn=arr.remove(0);
          if(!temp.contains(nn))
          temp.add(nn);
          arr.add(hash.get(nn));
          }
          if(checkCommonAncestor(arr))break;
          temp=new ArrayList<>();
        }
        root=arr.get(0);
        if(temp.size()==2){
        root.left=temp.get(0);
        root.right=temp.get(1);
        }
        else if(temp.size()==1)
        root.left=temp.get(0);
        return root;
    }
    public static boolean checkCommonAncestor(ArrayList<TreeNode>arr){
      int root=arr.get(0).val;
      for(int i=1;i<arr.size();i++){
        if(arr.get(i).val!=root)return false;
      }
      return true;
    }
}