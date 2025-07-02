class Solution {
  static ArrayList<ArrayList<int[]>>res;
    public int shortestBridge(int[][] grid) {
      res=new ArrayList<>();
      int visit[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
          for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1 && visit[i][j]!=1){
              callfun(i,j,grid,visit);
              System.out.println(i+" "+j);
            }
          }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<res.get(0).size();i++){
          int row=res.get(0).get(i)[0];
          int col=res.get(0).get(i)[1];
          System.out.println(row+" "+col);
          for(int j=0;j<res.get(1).size();j++){
            min=Math.min(min,1+(Math.abs(res.get(1).get(j)[0]-row)+Math.abs(res.get(1).get(j)[1]-col)));
          }
        }
        return min;
    }
    public static void callfun(int row,int col,int grid[][],int visit[][]){
      Queue<int[]>que=new LinkedList<>();
      que.add(new int[]{row,col});
      ArrayList<int[]>arr=new ArrayList<>();
      int n=grid.length;
      int m=grid[0].length;
      visit[row][col]=1;
      while(!que.isEmpty()){
         row=que.peek()[0];
         col=que.peek()[1];
        que.remove();
        if(row+1<n && grid[row+1][col]==1 && visit[row+1][col]!=1){
          que.add(new int[]{row+1,col});
          visit[row+1][col]=1;
        }
        if(row+1<n && grid[row+1][col]==0){
         arr.add(new int[]{row+1,col});
        }
         if(col+1<m && grid[row][col+1]==1 && visit[row][col+1]!=1){
          que.add(new int[]{row,col+1});
          visit[row][col+1]=1;
        }
        if(col+1<m && grid[row][col+1]==0){
          arr.add(new int[]{row,col+1});
        }
         if(row-1>=0 && grid[row-1][col]==1 && visit[row-1][col]!=1){
          que.add(new int[]{row-1,col});
          visit[row-1][col]=1;
        }
        if(row-1>=0 && grid[row-1][col]==0){
          arr.add(new int[]{row-1,col});
        }
         if(col-1>=0 && grid[row][col-1]==1 && visit[row][col-1]!=1){
          que.add(new int[]{row,col-1});
          visit[row][col-1]=1;
        }
        if(col-1>=0 && grid[row][col-1]==0){
        arr.add(new int[]{row,col-1});
        }
      }
      res.add(new ArrayList<>(arr));
    }
}