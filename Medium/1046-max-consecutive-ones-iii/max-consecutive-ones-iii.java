class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,len=0;
        while(right<nums.length){
            if(nums[right]==0 && k==0){
                while(left<=right){
                    if(nums[left]==0){
                        left++;
                        break;
                    }
                    left++;
                }
                k++;
            }
            if(nums[right]==0)
            k--;
            len=Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}