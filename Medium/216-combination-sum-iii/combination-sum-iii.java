class Solution {
  static List<List<Integer>>res;
    public List<List<Integer>> combinationSum3(int k, int n) {
      res=new ArrayList<>();   
      findAllCombinations(k,n,1,new ArrayList<>());
      return res; 
    }
    public static void findAllCombinations(int k,int n,int idx,List<Integer>arr){
      if(k==0){
        if(n==0)
        res.add(new ArrayList<>(arr));
        return;
      }
      if(idx==10)return;
      if(n<idx)return;
      arr.add(idx);
      findAllCombinations(k-1,n-idx,idx+1,arr);
      arr.remove(arr.size()-1);
      findAllCombinations(k,n,idx+1,arr);
    }
}