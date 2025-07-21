class Solution {
    public int numTeams(int[] rating) {
      int res=0;
      int n=rating.length;
      int dp[][][]=new int[n][n][3];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          Arrays.fill(dp[i][j],-1);
        }
      }
      res+=incrementStep(rating,0,0,0,dp);
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          Arrays.fill(dp[i][j],-1);
        }
      }
      res+=decrementStep(rating,0,0,0,dp);
      return res;
    }
    public static int incrementStep(int rating[],int idx,int k,int prev,int dp[][][]){
      if(k==3)return 1;
      if(idx==rating.length)return 0;
      int res=0;
      if(dp[idx][prev][k]!=-1)return dp[idx][prev][k];
      if(k==0)
      res+=incrementStep(rating,idx+1,k+1,idx,dp);
      else{
        if(rating[idx]>rating[prev]){
          res+=incrementStep(rating,idx+1,k+1,idx,dp);
        }
      }
      res+=incrementStep(rating,idx+1,k,prev,dp);
      return dp[idx][prev][k]=res;
    }
      public static int decrementStep(int rating[],int idx,int k,int prev,int dp[][][]){
      if(k==3)return 1;
      if(idx==rating.length)return 0;
      int res=0;
       if(dp[idx][prev][k]!=-1)return dp[idx][prev][k];
      if(k==0)
      res+=decrementStep(rating,idx+1,k+1,idx,dp);
      else{
        if(rating[idx]<rating[prev]){
          res+=decrementStep(rating,idx+1,k+1,idx,dp);
        }
      }
      res+=decrementStep(rating,idx+1,k,prev,dp);
      return dp[idx][prev][k]=res;
    }

}