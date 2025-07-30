class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<float[]>que=new PriorityQueue<>((a,b)->Float.compare(a[0],b[0]));
       for(int i=0;i<points.length;i++){
        que.add(new float[]{(float)Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]),points[i][0],points[i][1]});
       } 
       int res[][]=new int[k][2];
       int count=0;
       while(count!=k){
        res[count][0]=(int)que.peek()[1];
        res[count][1]=(int)que.peek()[2];
        que.remove();
        count++;
       }
       return res;
    }
}