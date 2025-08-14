class Solution {
    public int minDeletion(int[] nums) {
       int left=0,count=0;
       int n=nums.length;
       while(left<n){
        if(left+1<n && nums[left]!=nums[left+1]){
            left+=2;
        }
        else{
            count++;
            left++;
        }
       } 
       return count;
    }
}