class Solution {
    public int[] getAverages(int[] nums, int k) {
    int n=nums.length;
    int res[]=new int[n];
    Arrays.fill(res,-1);
    int left=0,right=k+k;
    if(right>=n)return res;
    long sum=nums[k];
    while(left<k){
      sum+=nums[left];
      sum+=nums[right-left];
      left++;
    }
    res[k]=(int)(sum/(2*k+1));
    int mid=k+1;
    left=1;
    right++;
    while(right<n){
      sum-=nums[left-1];
      sum+=nums[right];
      res[mid]=(int)((sum)/(2*k+1));
      mid++;
      right++;
      left++;
    }
    return res;
    }
}