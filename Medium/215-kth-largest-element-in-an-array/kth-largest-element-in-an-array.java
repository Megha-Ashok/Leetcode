class Solution {
    public int findKthLargest(int[] nums, int k) {
      int n=nums.length;
      PriorityQueue<Integer>que=new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<n;i++)que.add(nums[i]);
      while(k>1){
        que.remove();
        k--;
      }
      return que.peek();
    }
}