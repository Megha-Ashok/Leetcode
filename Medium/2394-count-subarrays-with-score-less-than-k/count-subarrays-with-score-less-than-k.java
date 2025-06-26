class Solution {
    public long countSubarrays(int[] nums, long k) {
     int l=0,r=0;
     long res=0,count=0,sum=0;
     while(r<nums.length){
      sum+=nums[r];
       count++;
      if(sum*count>=k){
        while(l<=r && sum*count>=k){
          sum-=nums[l];
          l++;
          count--;
        }
      }
      r++;
      if(sum*count<k)
      res+=count;
     }
     return res;   
    }
}