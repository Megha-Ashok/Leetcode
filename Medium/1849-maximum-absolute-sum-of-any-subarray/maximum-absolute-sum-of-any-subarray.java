class Solution {
    public int maxAbsoluteSum(int[] nums) {
      int minSum=nums[0];
      int min=nums[0];
      int maxSum=nums[0];
      int max=nums[0];
      for(int i=1;i<nums.length;i++){
        minSum=Math.min(nums[i],minSum+nums[i]);
        min=Math.min(min,minSum);
        maxSum=Math.max(nums[i],maxSum+nums[i]);
        max=Math.max(max,maxSum);
      }     
      return Math.max(Math.abs(min),Math.abs(max));
    }
}