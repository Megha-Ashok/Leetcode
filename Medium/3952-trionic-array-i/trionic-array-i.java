class Solution {
    public boolean isTrionic(int[] nums) {
      int l=0,r=1;
      while(r<nums.length && nums[l]<nums[r]){
        l++;
        r++;
      }
      if(l<=0)return false;
      int value=l;
      while(r<nums.length && nums[l]>nums[r]){
        l++;
        r++;
      }
      if(l<=value)return false;
      value=l;
      while(r<nums.length && nums[l]<nums[r]){
        l++;
        r++;
      }
      if(l<=value)return false;
      return r==nums.length;
    }
}