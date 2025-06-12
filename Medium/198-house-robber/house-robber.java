class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
       return callfun(dp,nums,n-1);
       
    }
    public static int callfun(int dp[],int nums[],int i){
        if(i==0)return nums[0];
        if(i==1)return Math.max(nums[0],nums[1]);
        if(dp[i]!=-1)return dp[i];
        return dp[i]=Math.max(callfun(dp,nums,i-1),nums[i]+callfun(dp,nums,i-2));
    }
   
}