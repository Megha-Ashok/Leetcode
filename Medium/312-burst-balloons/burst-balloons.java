class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int num[]=new int[n+2];
        for(int i=0;i<n;i++){
            num[i+1]=nums[i];
        }
        num[n+1]=1;
        num[0]=1;
     int dp[][]=new int[n+2][n+2];
     for(int i=0;i<=n+1;i++)
     Arrays.fill(dp[i],-1);
     return find(num,dp,1,n);
    }
    public static int find(int nums[],int dp[][],int i,int j){
        if(i>j)return 0;
        int max=0;
        if(dp[i][j]!=-1)return dp[i][j];
        for(int idx=i;idx<=j;idx++){
            int cost=nums[i-1]*nums[idx]*nums[j+1]+find(nums,dp,i,idx-1)+find(nums,dp,idx+1,j);
            max=Math.max(max,cost);
        }
        return dp[i][j]=max;
    }
}