class Solution {
     static List<List<Integer>>res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        Arrays.sort(nums);
        callfun(0,nums,arr);
        return res;
    }
    public static void callfun(int ind,int nums[],ArrayList<Integer>arr){
        res.add(new ArrayList<>(arr));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1])continue;
            arr.add(nums[i]);
            callfun(i+1,nums,arr);
            arr.remove(arr.size()-1);
        }
    } 
}