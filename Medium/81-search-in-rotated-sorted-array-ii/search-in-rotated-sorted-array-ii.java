class Solution {
    //added
    public boolean search(int[] nums, int target) {
     int i=0,j=nums.length-1;
     while(i<=j){
      if(nums[i]==target)return true;
      if(nums[j]==target)return true;
      i++;
      j--;
     }
     return false;
    }
}