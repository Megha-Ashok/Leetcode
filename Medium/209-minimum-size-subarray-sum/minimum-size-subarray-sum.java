class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int i=0,j=0,n=nums.length;
    int sum=0;
    int min=Integer.MAX_VALUE;
     while(j<n){
       sum+=nums[j];
       if(sum>=target){
        while(sum>=target){
          min=Math.min(min,j-i+1);
          sum-=nums[i];
          i++;
        }
       }
       j++;
     }
     if(min==Integer.MAX_VALUE)return 0;
     return min; 
    }
}