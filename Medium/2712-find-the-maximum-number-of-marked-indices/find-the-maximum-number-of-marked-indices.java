class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=(n/2)-1;
        int j=n-1;
        int i=mid,count=0;
        while(i>=0 && j>=mid){
         if(nums[i]*2<=nums[j]){
          count+=2;
          i--;
          j--;
         }
         else{
          i--;
         }
        }
        return count;
    }
}