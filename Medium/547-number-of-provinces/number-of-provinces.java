class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int visit[]=new int[n];
        int count=0;
      for(int i=0;i<n;i++){
            if(visit[i]==0){
                callfun(isConnected,i,visit);
                count++;
            }
      }    
      return count;
    }
    public static void callfun(int grid[][],int source,int visit[]){
          visit[source]=1;
          for(int i=0;i<grid[source].length;i++){
            if(grid[source][i]==1 && visit[i]==0){
                callfun(grid,i,visit);
            }
          }
    }
}