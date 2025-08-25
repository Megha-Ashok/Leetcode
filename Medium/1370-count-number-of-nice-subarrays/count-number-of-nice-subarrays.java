class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    return function(nums,k)-function(nums,k-1);
    }
    public static int function(int nums[],int k){
     int left=0,right=0,OddCount=0;
     int res=0,n=nums.length;
     while(right<n){
        if(nums[right]%2!=0)OddCount++;
        if(OddCount>k){
            while(left<=right && OddCount>k){
                if(nums[left]%2!=0)OddCount--;
                left++;
            }
        }
        res+=(right-left+1);
        right++;
     }
     return res;
    }
}