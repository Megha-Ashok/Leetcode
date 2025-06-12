class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
       int left=callfun(nums,0,n-1,dp);
        Arrays.fill(dp,-1);
       int right=callfun(nums,1,n,dp);
       return Math.max(left,right);
    }
    public static int callfun(int nums[],int start,int end,int dp[]){
        if(start>=end)return 0;
        if(dp[start]!=-1)return dp[start];
        return dp[start]=Math.max(callfun(nums,start+1,end,dp),nums[start]+callfun(nums,start+2,end,dp));
    }
}