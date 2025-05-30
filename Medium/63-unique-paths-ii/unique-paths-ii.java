class Solution {
    //added
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length,m=obstacleGrid[0].length;
        if(obstacleGrid[n-1][m-1]==1)return 0;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
       return callfun(obstacleGrid,n-1,m-1,dp);
    }
    public static int callfun(int grid[][],int row,int col,int dp[][]){
       if(row==0 && col==0)return 1;
       int left=0;
       if(dp[row][col]!=-1)return dp[row][col];
       if(row-1>=0 && grid[row-1][col]!=1)
       left=callfun(grid,row-1,col,dp);
       if(col-1>=0 && grid[row][col-1]!=1)
       left+=callfun(grid,row,col-1,dp);
       return dp[row][col]=left;   
    }

}