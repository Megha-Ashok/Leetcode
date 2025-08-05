class Solution {
  static List<List<Integer>>res;
    public List<List<Integer>> combine(int n, int k) {
      res=new ArrayList<>();
       findCombinations(new ArrayList<>(),1,n,k);
       return res;
    }
    public static  void findCombinations(List<Integer>arr,int idx,int n,int k){
      if(k==0){
        res.add(new ArrayList<>(arr));
        return;
      }
      if(idx>n)return;
      arr.add(idx);
      findCombinations(arr,idx+1,n,k-1);
      arr.remove(arr.size()-1);
      findCombinations(arr,idx+1,n,k);    
    }
}