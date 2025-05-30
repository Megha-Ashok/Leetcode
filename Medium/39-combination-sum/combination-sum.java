class Solution {
    static List<List<Integer>>arr1;
    //added
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    arr1=new ArrayList<>();
    ArrayList<Integer>arr=new ArrayList<>();
    callfun(candidates,target,0,arr);
    return arr1;
   }
   public static void callfun(int[] candidates, int target,int i,ArrayList<Integer>arr){
    if(i==candidates.length){
        if(target==0){
            arr1.add(new ArrayList<>(arr));
        }
        return;
    }
    if(candidates[i]<=target){
      arr.add(candidates[i]);
      callfun(candidates,target-candidates[i],i,arr);
      arr.remove(arr.size()-1);
    }
      callfun(candidates,target,i+1,arr);
   }
}