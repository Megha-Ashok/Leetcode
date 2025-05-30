class Solution {
    static List<List<Integer>>res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer>arr=new ArrayList<>();
        res=new ArrayList<>();
        Arrays.sort(candidates);
      callfun(candidates,target,0,arr);
      return res;
   }
   public static void callfun(int candidates[],int target,int i,ArrayList<Integer>arr){
       if(target==0){
        res.add(new ArrayList<>(arr));
        return;
       }
       for(int ind=i;ind<candidates.length;ind++){
        if(ind>i && candidates[ind]==candidates[ind-1])continue;
        if(target<candidates[ind])break;
        arr.add(candidates[ind]);
        callfun(candidates,target-candidates[ind],ind+1,arr);
        arr.remove(arr.size()-1);
       }
   }
}