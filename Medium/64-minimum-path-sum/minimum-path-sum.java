class Solution {
    //added
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
       return callfun(grid,n-1,m-1,dp);
    }
    
    public static int callfun(int grid[][],int row,int col,int dp[][]){
        if(row==0&& col==0){
            dp[0][0]=grid[row][col];
            return dp[0][0];
        }
        if(dp[row][col]!=-1)return dp[row][col];
        int left=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        if(row-1>=0){
        left=grid[row][col]+callfun(grid,row-1,col,dp);
        }
        if(col-1>=0){
        right=grid[row][col]+callfun(grid,row,col-1,dp);
        }
       return dp[row][col]=Math.min(left,right);
    }
}