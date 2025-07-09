class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
      int n=grid.size();
      if(n==1 && grid.get(0).get(0)==1)return 0;
      if(n==1 && grid.get(0).get(0)==0)return 1;
      boolean visit[][]=new boolean[n][n];
      Queue<int[]>que=new LinkedList<>();
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          if(grid.get(i).get(j)==1){
            que.add(new int[]{i,j});
            visit[i][j]=true;
          }
        }
      }
      int directions[][]={{0,1},{1,0},{0,-1},{-1,0}};
      int dist[][]=new int[n][n];
      int level=0;
      while(!que.isEmpty()){
        int size=que.size();
        for(int i=0;i<size;i++){
          int row=que.peek()[0];
          int col=que.peek()[1];
          dist[row][col]=level;
          que.remove();
          for(int direct[]:directions){
           int row_=row+direct[0];
           int col_=col+direct[1];
           if(row_>=0 && col_>=0 && row_<n && col_<n && !visit[row_][col_]){
            que.add(new int[]{row_,col_});
            visit[row_][col_]=true;
           }
          }
        }
        level++;
      }
      int left=0;
      int right=400;
      int result=400;
      while(left<=right){
      int mid=left+(right-left)/2;
      if(check(mid,dist,n)){
          result=mid;
          left=mid+1;
      }
      else{
        right=mid-1;
      }
      }
      return result;
    }
    public static boolean check(int target,int dist[][],int n){
      Queue<int[]>que=new LinkedList<>();
      que.add(new int[]{0,0});
       if(dist[0][0]<target)return false;
       boolean visit[][]=new boolean[n][n];
       int directions[][]={{0,1},{1,0},{-1,0},{0,-1}};
       visit[0][0]=true;
      while(!que.isEmpty()){
        int row=que.peek()[0];
        int col=que.peek()[1];
        que.remove();
        for(int direct[]:directions){
        int row_=row+direct[0];
        int col_=col+direct[1];
        if(row_>=0 && col_>=0 && row_<n && col_<n && !visit[row_][col_]){
          if(dist[row_][col_]>=target){
            if(row_==n-1 && col_==n-1)return true;
            que.add(new int[]{row_,col_});
            visit[row_][col_]=true;
          }
        }
        }
      }
      return false;
    }
}