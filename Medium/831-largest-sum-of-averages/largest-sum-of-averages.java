class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        double dp[][]=new double[k+1][nums.length];
        for(int i=0;i<=k;i++){
            Arrays.fill(dp[i],-1);
        }
       return find(nums,k,0,dp); 
    }
    public static double find(int nums[],int k,int start,double dp[][]){
     if(start==nums.length){
      return 0;
     }
     if(dp[k][start]!=-1)return dp[k][start];
     if(k==1){
        double sum=0;
      for(int i=start;i<nums.length;i++){
        sum+=nums[i];
      }
      return sum/(nums.length-start);
     }
     double sum=0,max=0;
     for(int i=start;i<nums.length;i++){
        sum+=nums[i];
        max=Math.max(max,sum/(i-start+1)+find(nums,k-1,i+1,dp));
     }
     return dp[k][start]=max;
    }
}