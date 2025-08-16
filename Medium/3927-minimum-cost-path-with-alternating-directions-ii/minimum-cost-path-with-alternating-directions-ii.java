class Solution {
    public long minCost(int m, int n, int[][] waitCost) {
        long dp[][]=new long[m][n];
        for(int i=0;i<m;i++)Arrays.fill(dp[i],-1);
        return 1+findMinimumCost(m,n,waitCost,0,0,dp);
    }
    public static long findMinimumCost(int m,int n,int waitCost[][],int row,int col,long dp[][]){
        if(row==m-1 && col==n-1)return -waitCost[m-1][n-1];
        long down=Long.MAX_VALUE,right=Long.MAX_VALUE;
        if(dp[row][col]!=-1)return dp[row][col];
        if(col+1<n){
        right=(row+1)*(col+1+1)+waitCost[row][col+1]+findMinimumCost(m,n,waitCost,row,col+1,dp);
        }
        if(row+1<m){
        down=(row+1+1)*(col+1)+waitCost[row+1][col]+findMinimumCost(m,n,waitCost,row+1,col,dp);
        }
        return dp[row][col]=Math.min(right,down);
    }
}