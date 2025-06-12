/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static ArrayList<TreeNode>temp;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      temp=new ArrayList<>();
      temp.add(p);
      ArrayList<ArrayList<TreeNode>>temp2=new ArrayList<>();
      if(!callfun(root,p))return null;
      temp2.add(new ArrayList<>(temp));
      temp=new ArrayList<>();
      temp.add(q);
      if(!callfun(root,q))return null;
       temp2.add(new ArrayList<>(temp));
      int i=0;
      while(i<temp2.get(1).size()){
        if(temp2.get(0).contains(temp2.get(1).get(i)))return temp2.get(1).get(i);
        i++;
      }
      return null;

    }
    public static boolean callfun(TreeNode root,TreeNode p){
      if(root==null)return false;
      if(root.val==p.val)return true;
      boolean left=callfun(root.left,p);
      boolean right=callfun(root.right,p);
      if(left||right)temp.add(root);
      return left||right;
    }
}
    /*
     if(root==null || root==p ||root==q)return root;
     TreeNode left=lowestCommonAncestor(root.left,p,q);
     TreeNode right=lowestCommonAncestor(root.right,p,q);
     if(left==null){
        return right;
     }
    else if(right==null)return left;
    else{
        return root;
    }*/
    /*
    ArrayList<Integer>arr=new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
       boolean flag=fun(root,p,arr);
       if(flag){
        ans.add(arr);
       }
       else{
        return null;
       }
       arr=new ArrayList<>();
       flag=fun(root,q,arr);
       if(flag){
        ans.add(arr);
       }
       else{
        return null;
       }
      int n=ans.get(0).size();
      int n1=ans.get(1).size();
      int i=0,j=0;
      while(i!=n && j!=n1){
        if(ans.get(0).get(i)!=ans.get(1).get(j)){
            break;       
      }
        i++;
        j++;
      }
      return new TreeNode(ans.get(0).get(i-1));
    */
