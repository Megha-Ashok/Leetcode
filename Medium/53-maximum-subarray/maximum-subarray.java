class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int curr_so=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],nums[i]+curr);
            curr_so=Math.max(curr,curr_so);
        }
        return curr_so;
    }
}