class Solution {
  static int visit[][];
    public int numIslands(char[][] grid) {
      int n=grid.length;
      int m=grid[0].length;
      visit=new int[n][m];
      int count=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          if(grid[i][j]=='1' && visit[i][j]!=1){
            callfun(i,j,grid,n,m);
            count++;
          }
        }
       }
       return count; 
    }
    public static void callfun(int row,int col,char grid[][],int n,int m){
      visit[row][col]=1;
      if(row+1<n && grid[row+1][col]=='1' && visit[row+1][col]!=1)callfun(row+1,col,grid,n,m);
      if(col+1<m && grid[row][col+1]=='1' && visit[row][col+1]!=1)callfun(row,col+1,grid,n,m);
      if(row-1>=0 && grid[row-1][col]=='1' && visit[row-1][col]!=1)callfun(row-1,col,grid,n,m);
      if(col-1>=0 && grid[row][col-1]=='1' && visit[row][col-1]!=1)callfun(row,col-1,grid,n,m);
    }
}