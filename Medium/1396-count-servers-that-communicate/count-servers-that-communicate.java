class Solution {
    public int countServers(int[][] grid) {
      PriorityQueue<int[]>row=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
      PriorityQueue<int[]>col=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1){
                row.add(new int[]{i,j});
                col.add(new int[]{j,i});
            }

        }
      }
      int visit[][]=new int[grid.length][grid[0].length];
      while(!row.isEmpty()){
        int arr[]=row.remove();
        if(!row.isEmpty() && row.peek()[0]==arr[0]){
            visit[row.peek()[0]][row.peek()[1]]=1;
            visit[arr[0]][arr[1]]=1;
        }
      }
      while(!col.isEmpty()){
        int arr[]=col.remove();
        if(!col.isEmpty() && col.peek()[0]==arr[0]){
            visit[col.peek()[1]][col.peek()[0]]=1;
            visit[arr[1]][arr[0]]=1;
        }
      }
      int count=0;
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
          if(visit[i][j]==1)count++;
        }
      }
      return count;
    }
}