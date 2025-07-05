class Solution {
    public int minimumEffortPath(int[][] heights) {
        Queue<int[]>que=new LinkedList<>();
        que.add(new int[]{0,0,0});
        int m=heights.length;
        int n=heights[0].length;
        int dist[][]=new int[m][n];
        for(int i=0;i<m;i++)Arrays.fill(dist[i],Integer.MAX_VALUE);
        int dict[][]={{0,1},{1,0},{-1,0},{0,-1}};
        int res=Integer.MAX_VALUE;
        while(!que.isEmpty()){
          int size=que.size();
          for(int i=0;i<size;i++){
            int row=que.peek()[0];
            int col=que.peek()[1];
            int diff=que.peek()[2];
            que.remove();
            for(int j=0;j<dict.length;j++){
              int row_=row+dict[j][0];
              int col_=col+dict[j][1];
              if(row_==m-1 && col_==n-1){
                res=Math.min(res,Math.max(diff,Math.abs(heights[row][col]-heights[row_][col_])));
                continue;
              }
              if(row_>=0 && col_>=0 && row_<m && col_<n && dist[row_][col_]>Math.max(diff,Math.abs(heights[row][col]-heights[row_][col_]))){
                    dist[row_][col_]=Math.max(diff,Math.abs(heights[row][col]-heights[row_][col_]));
                    que.add(new int[]{row_,col_,dist[row_][col_]});
              }
            }
          }
        }
        if(res==Integer.MAX_VALUE)return 0;
         return res;
    }
}