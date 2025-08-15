class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        if(n==0||n==1)return n;
       int dp[]=new int[n];
       Arrays.fill(dp,1);
       int count[]=new int[n];
       int maxi=0;
       Arrays.fill(count,1);
       for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
         if(nums[j]<nums[i]){
            if(dp[i]<dp[j]+1){
            dp[i]=dp[j]+1;
            count[i]=count[j];
            }
            else if(dp[i]==dp[j]+1){
                count[i]+=count[j];
            }
         }
        }
        if(dp[i]>maxi)maxi=dp[i];
       }
       int res=0;
       for(int i=0;i<n;i++){
        if(dp[i]==maxi)res+=count[i];
       }
       return res;
    }
}