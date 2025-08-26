class Solution {
    public int maxScore(int[] nums, int k) {
       int n=nums.length;
       int sum=0,l=k-1,r=n-1;
       for(int i=0;i<k;i++){
        sum+=nums[i];
       }
       int max=sum;
       while(l>=0 && r>=0){
        sum-=nums[l];
        sum+=nums[r];
        max=Math.max(sum,max);
        l--;
        r--;
       }
       return max;
    }
}