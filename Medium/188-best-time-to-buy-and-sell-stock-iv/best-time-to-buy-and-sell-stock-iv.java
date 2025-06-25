class Solution {
    public int maxProfit(int k, int[] prices) {
      int n=prices.length;
    int dp[][]=new int[n][k*2];
    for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
    return profitGot(prices, 0,k, 0,dp);
}
 public static int profitGot(int price[], int idx, int k,int buy,int dp[][])
{
    if(buy>=k*2 || idx==price.length)return 0;
     if(dp[idx][buy]!=-1)return dp[idx][buy];
     int profit=Integer.MIN_VALUE;
     if(buy%2==0){
      profit=profitGot(price,idx+1,k,buy+1,dp)-price[idx];
      profit=Math.max(profit,profitGot(price,idx+1,k,buy,dp));
     }
     else{
      profit=profitGot(price,idx+1,k,buy+1,dp)+price[idx];
      profit=Math.max(profit,profitGot(price,idx+1,k,buy,dp));
     }
     return dp[idx][buy]=profit;
}
}