class Solution {
    public int countSubarrays(int[] nums) {
        int first=0,second=1,third=2;
        int n=nums.length;
        int count=0;
        while(third<n){
          if(nums[first]+nums[third]==(nums[second]/2) && nums[second]%2==0)count++;
          first++;
          second++;
          third++;
        }
        return count;
    }
}