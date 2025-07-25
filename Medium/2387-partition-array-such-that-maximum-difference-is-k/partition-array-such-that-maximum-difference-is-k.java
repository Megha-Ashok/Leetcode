class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=0,result=0;
        while(r<nums.length){
          while(r<nums.length && nums[r]-nums[l]<=k){
            r++;
          }
          result++;
          l=r;
        }
        return result;
    }
}