class Solution {
    //added
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
         return callfun(m-1,n-1,dp);
    }
    public static int callfun(int m,int n,int dp[][]){
        if(m<0 || n<0)return 0;
        if(m==0 && n==0){
            return 1;
        }
        if(dp[m][n]!=0)return dp[m][n];
        int left=callfun(m-1,n,dp);
       int right=callfun(m,n-1,dp); 
        return dp[m][n]=left+right;
    }
}
