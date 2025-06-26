class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
      int max=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
      int dp[][]=new int[nums[i]+1][queries.length];
      for(int j=0;j<=nums[i];j++){
        Arrays.fill(dp[j],-1);
      }
      int val=callfun(nums[i],queries,0,i,dp);
      max=Math.max(max,val);
     }
     if(max==Integer.MAX_VALUE)return -1;
      return max;
    }
    public static int callfun(int target,int queries[][],int idx,int targetIndex,int dp[][]){
      if(target==0)return idx;
      if(idx==queries.length){
          return Integer.MAX_VALUE;
      }
      if(dp[target][idx]!=-1)return dp[target][idx];
      int left=Integer.MAX_VALUE;
      if(target>=queries[idx][2] && queries[idx][0]<=targetIndex && queries[idx][1]>=targetIndex){
        left=callfun(target-queries[idx][2],queries,idx+1,targetIndex,dp);
      }
      int right=callfun(target,queries,idx+1,targetIndex,dp);
      return dp[target][idx]=Math.min(left,right);
    }
}