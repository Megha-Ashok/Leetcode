class Solution {
    static  List<List<Integer>>res;
    public List<List<Integer>> subsets(int[] nums) {
       res=new ArrayList<>();
       ArrayList<Integer>arr=new ArrayList<>();
      callfun(nums,arr,0);
       return res;
    }
    public static void callfun(int nums[],ArrayList<Integer>arr,int j){
         if(j==nums.length){
            res.add(new ArrayList<>(arr));
            return;
         }
         arr.add(nums[j]);
         callfun(nums,arr,j+1);
         arr.remove(arr.size()-1);
         callfun(nums,arr,j+1);
    }
}