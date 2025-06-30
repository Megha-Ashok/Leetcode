class Solution {
    public int[][] updateMatrix(int[][] mat) {
    int n=mat.length;
    int m=mat[0].length;
    int res[][]=new int[n][m];
    Queue<int[]>que=new LinkedList<>();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(mat[i][j]==0){
              res[i][j]=0;
              que.add(new int[]{i,j});
            }
            else{
              res[i][j]=-1;
            }
        }
    }
    int directions[][]={{-1,0},{0,-1},{1,0},{0,1}};
    while(!que.isEmpty()){
      int i=que.peek()[0];
      int j=que.peek()[1];
      que.remove();
      for(int dir[]:directions){
         int dir_i=i+dir[0];
         int dir_j=j+dir[1];
         if(dir_i>=0 && dir_i<n && dir_j>=0 && dir_j<m &&res[dir_i][dir_j]==-1){
          res[dir_i][dir_j]=res[i][j]+1;
          que.add(new int[]{dir_i,dir_j});
         }
      }
    }
    return res;
   
    }
    public static int callfun(int mat[][],int row,int col,int visit[][],int dp[][]){
          if(mat[row][col]==0)return 0;
          int left=99999;
          int right=left,right1=left,left1=left;
          if(dp[row][col]!=-1)return dp[row][col];
        if(row+1<mat.length && visit[row+1][col]==0){
          visit[row+1][col]=1;
          left=1+callfun(mat,row+1,col,visit,dp);
          visit[row+1][col]=0;
        }
        if(row-1>=0 && visit[row-1][col]==0){
          visit[row-1][col]=1;
          right=1+callfun(mat,row-1,col,visit,dp);
          visit[row-1][col]=0;
        }
        if(col+1<mat[0].length && visit[row][col+1]==0){
          visit[row][col+1]=1;
          left1=1+callfun(mat,row,col+1,visit,dp);
          visit[row][col+1]=0;
        }
        if(col-1>=0 && visit[row][col-1]==0){
          visit[row][col-1]=1;
          right1=1+callfun(mat,row,col-1,visit,dp);
          visit[row][col-1]=0;
        }
          return dp[row][col]=Math.min(Math.min(left,left1),Math.min(right,right1));
    }
    
}