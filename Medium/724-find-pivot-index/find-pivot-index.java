class Solution {
    public int pivotIndex(int[] nums) {
      int n=nums.length;
       int sum=0; 
       for(int i=0;i<n;i++)
        sum+=nums[i];
        int sumr=sum;
        int suml=0;
        for(int i=0;i<n;i++){
          sumr-=nums[i];
          if(sumr==suml)return i;
          suml+=nums[i];
        }
        return -1;
    
    }
}