class Solution {
    public int countHillValley(int[] nums) {
      int mid=1,l=0,r=2,count=0,n=nums.length;
      while(mid<n){
        while(l>=0 && nums[l]==nums[mid]){
                l--;
        }
        while(r<n && nums[r]==nums[mid])r++;
        if(l>=0 && r<n && nums[l]<nums[mid] && nums[r]<nums[mid])count++;
        else if(l>=0 && r<n && nums[l]>nums[mid] && nums[r]>nums[mid])count++;
        l=mid;
        mid=r;
      }
      return count;
    }
}