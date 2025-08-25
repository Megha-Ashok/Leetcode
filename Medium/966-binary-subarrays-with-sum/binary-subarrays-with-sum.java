class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
     return function(nums,goal)-function(nums,goal-1);
    }
    public static int function(int nums[],int goal){
        if(goal<0)return 0;
        int left=0,right=0,count=0,sum=0;
        int n=nums.length;
        while(right<n){
            sum+=nums[right];
            if(sum>goal){
                while(left<=right && sum>goal){
                    sum-=nums[left];
                    left++;
                }
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
}