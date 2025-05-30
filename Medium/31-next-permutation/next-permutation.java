class Solution {
  //added to github
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int max=nums[n-1],i=n-2;
      for(i=n-2;i>=0;i--){
        if(nums[i]<max)break;
        if(max<nums[i])max=nums[i];
      }
      if(i<0){
        Arrays.sort(nums);
        return;
      }
      int min=i+1;
      for(int j=i+1;j<n;j++){
         if(nums[i]<nums[j]){
         if(nums[min]>nums[j]){
            min=j;
         }  
        }
      }
      int temp=nums[i];
      nums[i]=nums[min];
      nums[min]=temp;
      Arrays.sort(nums,i+1,n);
  }
}