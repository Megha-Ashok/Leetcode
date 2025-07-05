class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
     Queue<int []>que=new LinkedList<>();
     que.add(new int[]{k,0});
     HashMap<Integer,ArrayList<int[]>>hash=new HashMap<>();
     for(int i=1;i<=n;i++){
      hash.put(i,new ArrayList<>());
     }
     for(int i=0;i<times.length;i++){
      hash.get(times[i][0]).add(new int []{times[i][1],times[i][2]});
     }
     int max=0;
     int dist[]=new int[n+1];
     Arrays.fill(dist,Integer.MAX_VALUE);
     dist[k]=0;
     HashSet<Integer>set=new HashSet<>();
     while(!que.isEmpty()){
      int size=que.size();
      for(int i=0;i<size;i++){
        int distance=que.peek()[1];
        int key=que.peek()[0];
        set.add(key);
        que.remove();
        for(int child[]:hash.get(key)){
         if(dist[child[0]]>distance+child[1]){
          que.add(new int[]{child[0],distance+child[1]});
          dist[child[0]]=distance+child[1];
         }
        }
      }
     }
     if(set.size()<n)return -1;
     for(int i=1;i<=n;i++)max=Math.max(max,dist[i]);
     return max;
    }
}