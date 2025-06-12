class Solution {
    public int findMin(int[] nums) {
      int n=nums.length;
     return callfun(nums,0,n-1);
    }
    public static int callfun(int nums[],int l,int r){
    int mid=l+(r-l)/2;
    if(l<r){
      if(nums[mid]>nums[r])return callfun(nums,mid+1,r);
      return callfun(nums,l,mid);
    }
    return nums[mid];
    }
}