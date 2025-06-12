class Solution {
    public int findPeakElement(int[] nums) {
      int j=0,max=nums[0];
        for(int i=0;i<nums.length;i++){
          if(nums[i]>max){
            max=nums[i];
            j=i;
          }
        }
        return j;
    }
}