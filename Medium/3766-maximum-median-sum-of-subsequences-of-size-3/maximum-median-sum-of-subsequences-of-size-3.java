class Solution {
    public long maximumMedianSum(int[] nums) {
       Arrays.sort(nums);
       int l=0,r=nums.length-2;
       long sum=0;
       while(l<r){
        sum+=nums[r];
        r-=2;
        l++;
       }
       return sum;
    }
}