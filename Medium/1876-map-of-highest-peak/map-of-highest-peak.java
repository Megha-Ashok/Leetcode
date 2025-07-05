class Solution {
    public int[][] highestPeak(int[][] isWater) {
      int m=isWater.length;
      int n=isWater[0].length;
      Queue<int[]>que=new LinkedList<>();
        int res[][]=new int[m][n];
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            if(isWater[i][j]==1){
              que.add(new int[]{i,j});
              res[i][j]=0;
            }
            else{
              res[i][j]=-1;
            }
          }
        }
        int visit[][]=new int[m][n];
        int direction[][]={{-1,0},{0,-1},{1,0},{0,1}};
        while(!que.isEmpty()){
          int size=que.size();
          for(int i=0;i<size;i++){
            int arr[]=que.remove();
          for(int dire[]:direction){
            int row=arr[0]+dire[0];
            int col=arr[1]+dire[1];
            if(row>=0 && col>=0 && row<m && col<n && res[row][col]==-1){
             res[row][col]=res[arr[0]][arr[1]]+1;
             que.add(new int[]{row,col});
            }
          }
          }
        }
        return res;
    }
}