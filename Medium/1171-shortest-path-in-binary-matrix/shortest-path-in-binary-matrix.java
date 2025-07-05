class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
      if(grid[0][0]==1)return -1;
      int m=grid.length;
      int n=grid[0].length;
      if(m==1 && grid[0][0]==0)return 1;
      Queue<int[]>que=new LinkedList<>();
      que.add(new int[]{0,0});
      int visit[][]=new int[m][n];
      visit[0][0]=1;
      int distance=0;
      int dict[][]={{0,1},{1,0},{0,-1},{-1,0},{-1,-1},{1,1},{-1,1},{1,-1}};
      while(!que.isEmpty()){
        int size=que.size();
        distance++;
        for(int i=0;i<size;i++){
          int arr[]=que.remove();
          for(int j=0;j<dict.length;j++){
            int row=arr[0]+dict[j][0];
            int col=arr[1]+dict[j][1];
            if(row>=0 && col>=0 && row<m && col<n && grid[row][col]==0 && visit[row][col]!=1){
            que.add(new int[]{row,col});
            visit[row][col]=1;
            }
            if(row==m-1 && col==n-1 && grid[m-1][n-1]==0)return distance+1;
          }
        }
      }
      return -1;
    }
}