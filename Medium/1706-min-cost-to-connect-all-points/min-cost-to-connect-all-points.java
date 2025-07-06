class Solution {
    public int minCostConnectPoints(int[][] points) {
      int n=points.length;
      ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
      for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
      }
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
        int dist=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
        adj.get(i).add(new int[]{j,dist});
        adj.get(j).add(new int[]{i,dist});
        }
      }
      PriorityQueue<int[]>que=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
       int visit[]=new int[n];
       visit[0]=1;
       for(int child[]:adj.get(0)){
          que.add(new int[]{child[1],child[0]});
       }
       int sum=0,count=1;
       while(!que.isEmpty()){
        int arr[]=que.remove();
        if(visit[arr[1]]!=1){
          sum+=arr[0];
          visit[arr[1]]=1;
          count++;
        }
        if(count==n)return sum;
        for(int child[]:adj.get(arr[1])){
          if(visit[child[0]]!=1){
            que.add(new int[]{child[1],child[0]});
          }
        }
       }
       return sum;
    }
}