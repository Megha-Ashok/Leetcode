class Solution {
  static PriorityQueue<int[]>que;
  static int visit[][];
    public int[] maxPoints(int[][] grid, int[] queries) {
      int ans[]=new int[queries.length];
      que=new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
      visit=new int[grid.length][grid[0].length];
      ArrayList<int[]>query=new ArrayList<>();
      for(int i=0;i<queries.length;i++){
        query.add(new int[]{queries[i],i});
      }
      Collections.sort(query,(a,b)->Integer.compare(a[0],b[0]));
      que.add(new int[]{0,0,grid[0][0]});
      visit[0][0]=1;
        for(int i=0;i<query.size();i++){
          if(i>0){
            ans[query.get(i)[1]]=ans[query.get(i-1)[1]];
          }
          ans[query.get(i)[1]]+=callfun(query.get(i)[0],grid,que);
        }
        return ans;
    }
    public static int callfun(int val,int grid[][],PriorityQueue<int[]>que){
     int count=0;
     while(!que.isEmpty()){
       if(que.peek()[2]>=val) break;
       int vals[]=que.remove();
       count++;
       if(vals[0]+1<grid.length && visit[vals[0]+1][vals[1]]!=1){
        que.add(new int[]{vals[0]+1,vals[1],grid[vals[0]+1][vals[1]]});
        visit[vals[0]+1][vals[1]]=1;
       }
       
       if(vals[1]+1<grid[0].length && visit[vals[0]][vals[1]+1]!=1){
        que.add(new int[]{vals[0],vals[1]+1,grid[vals[0]][vals[1]+1]});
        visit[vals[0]][vals[1]+1]=1;
       }
       
       if(vals[0]-1>=0 && visit[vals[0]-1][vals[1]]!=1){
        que.add(new int[]{vals[0]-1,vals[1],grid[vals[0]-1][vals[1]]});
        visit[vals[0]-1][vals[1]]=1;
       }
       
       if(vals[1]-1>=0 && visit[vals[0]][vals[1]-1]!=1){
        que.add(new int[]{vals[0],vals[1]-1,grid[vals[0]][vals[1]-1]});
        visit[vals[0]][vals[1]-1]=1;
       }
     }
     return count;
    }
}