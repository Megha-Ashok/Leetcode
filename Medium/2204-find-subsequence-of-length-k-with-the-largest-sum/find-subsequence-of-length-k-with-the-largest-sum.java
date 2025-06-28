class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
      PriorityQueue<int[]>que=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
      for(int i=0;i<nums.length;i++){
        que.add(new int[]{nums[i],i});
      }
      ArrayList<int[]>arr=new ArrayList<>();
      for(int i=0;i<k;i++){
        arr.add(new int[]{que.peek()[0],que.peek()[1]});
        que.remove();
      }
      Collections.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
      int res[]=new int[k];
      for(int i=0;i<k;i++){
        int nn[]=arr.remove(0);
        res[i]=nn[0];
      }
      return res;
      }
}