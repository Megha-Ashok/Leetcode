class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length;
        int dp[][]=new int[n][4];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
       return findProfit(prices,0,0,dp);
    }
    public static int findProfit(int prices[],int idx,int buy,int dp[][]){
      if(buy>=4 || idx>=prices.length)return 0;
      int profit=Integer.MIN_VALUE;
      if(dp[idx][buy]!=-1)return dp[idx][buy];
      if(buy%2==0){
      profit=findProfit(prices,idx+1,buy+1,dp)-prices[idx];
      profit=Math.max(profit,findProfit(prices,idx+1,buy,dp));
      }
      else{
      profit=findProfit(prices,idx+1,buy+1,dp)+prices[idx];
      profit=Math.max(profit,findProfit(prices,idx+1,buy,dp));
      }
        dp[idx][buy]=profit;
      return profit;
    }
}