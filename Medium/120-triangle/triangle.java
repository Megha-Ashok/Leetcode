class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
         int dp[][]=new int[n+1][n+1];
         for(int row=n-1;row>=0;row--){
          for(int col=0;col<triangle.get(row).size();col++){
          int left=triangle.get(row).get(col)+dp[row+1][col];
          int right=triangle.get(row).get(col)+dp[row+1][col+1];
          dp[row][col]=Math.min(left,right);
          }
         }
        return dp[0][0];
    }
    public static int callfun(List<List<Integer>> triangle,int n,int row,int col,int dp[][]){
        if(row==n)return 0;
        if(dp[row][col]!=0)return dp[row][col];
        int left=triangle.get(row).get(col)+callfun(triangle,n,row+1,col,dp);
        int right=triangle.get(row).get(col)+callfun(triangle,n,row+1,col+1,dp);
        return dp[row][col]=Math.min(left,right);
    }
}