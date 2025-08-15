class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int prev[]=new int[n];
        Arrays.fill(prev,-1);
        int maxi=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
            if(dp[i]>dp[maxi])maxi=i;
        }
        List<Integer>res=new ArrayList<>();
        for(int i=maxi;i>=0;i=prev[i]){
            res.add(nums[i]);
        }
        return res;
    }
}