class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        long left=0;
        for(int i=0;i<nums.length-1;i++){
         left+=nums[i];
         long right=sum-left;
         if(left>=right)count++;
        }
        return count;
    }
}