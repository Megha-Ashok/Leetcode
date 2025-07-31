class Solution {
    public long minimumDifference(int[] nums) {
        PriorityQueue<Long>que1=new PriorityQueue<>(Collections.reverseOrder());
        int n3=nums.length;
        int n=n3/3;
        long left[]=new long[n*2];
        long sum=0;
      for(int i=0;i<n;i++){
        sum+=nums[i];
        left[i]=sum;
        que1.add((long)nums[i]);
      }
      for(int i=n;i<n*2;i++){
        sum+=nums[i];
        que1.add((long)nums[i]);
        sum-=que1.peek();
        que1.poll();
        left[i]=sum;
      }
      sum=0;
      long right[]=new long[n*2];
      int idx=n*2-1;
      que1=new PriorityQueue<>();
      for(int i=n3-1;i>=n*2;i--){
        que1.add((long)nums[i]);
        sum+=nums[i];
        right[idx]=sum;
        idx--;
      }
      for(int i=n*2-1;i>=n;i--){
        sum+=nums[i];
        que1.add((long)nums[i]);
        sum-=que1.peek();
        que1.poll();
        right[idx]=sum;
        idx--;
      }
      int r=0;
      long res=Long.MAX_VALUE;
      for(int i=n-1;i<n*2;i++){
       res=Math.min(res,left[i]-right[r]);
       r++;
      }
      return res;

    }
}