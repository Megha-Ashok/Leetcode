class Solution {
    public int maxRotateFunction(int[] nums) {
     int n=nums.length;
     if(n<2)return 0;
     int total_sum=0,current_sum=0;
     for(int i=0;i<n;i++){
        total_sum+=nums[i];
        current_sum+=(nums[i]*i);
     }
     int  max=current_sum;
     for(int i=1;i<n;i++){
     current_sum+=total_sum-n*nums[n-i];
     max=Math.max(max,current_sum);
     }
     return max;
    }
}