class Solution {
    static int count;
    public int longestConsecutive(int[] nums) {
      if(nums.length<2)return nums.length;
      PriorityQueue<Integer>que=new PriorityQueue<>();
      for(int i=0;i<nums.length;i++){
        que.add(nums[i]);
      }
      int prev=que.peek();
      int count=0,res=0;
      while(!que.isEmpty()){
       if(que.peek()==prev){
        count++;
        prev++;
       }
       else if(prev==que.peek()+1){
        que.remove();
        continue;
       }
       else{
        res=Math.max(count,res);
        count=1;
        prev=que.peek();
        prev++;
       }
       que.remove();
      }
      res=Math.max(res,count);
      return res;
    }
}