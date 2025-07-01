class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
      int n=nums.length;
      int curSum[]=new int[n];
      for(int i=1;i<n;i++){
        if(nums[i]%2==0 && nums[i-1]%2==0){
          curSum[i]=curSum[i-1]+1;
        }
        else if(nums[i]%2!=0 && nums[i-1]%2!=0){
          curSum[i]=curSum[i-1]+1;
        }
        else{
          curSum[i]=curSum[i-1];
        }
      }
      boolean res[]=new boolean[queries.length];
      for(int i=0;i<queries.length;i++){
        int from=queries[i][0];
        int to=queries[i][1];
        if(curSum[to]-curSum[from]>0)res[i]=false;
        else res[i]=true;
      }
      return res;
    }
}