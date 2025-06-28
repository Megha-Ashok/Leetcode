class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      int n=nums.length;
       int left=0,right=n-1;
       int res[]=new int[right+1];
       Arrays.fill(res,pivot);
       for(int i=0;i<n;i++){
        if(nums[i]<pivot)res[left++]=nums[i];
        if(nums[n-i-1]>pivot)res[right--]=nums[n-i-1];
       }
    
      return res;
    }
}