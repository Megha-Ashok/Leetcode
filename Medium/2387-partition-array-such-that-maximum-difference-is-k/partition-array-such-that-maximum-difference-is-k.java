class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,result=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i]-nums[l]>k){
          result++;
          l=i;
        }
       }
        return result+1;
    }
}