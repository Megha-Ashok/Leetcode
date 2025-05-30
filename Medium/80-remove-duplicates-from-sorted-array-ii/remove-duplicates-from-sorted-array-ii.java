class Solution {
    public int removeDuplicates(int[] nums) {
       int s=1,k=0,n=nums.length;
       for(int i=1;i<n;i++){
        if(nums[i]!=nums[i-1]){
            int count=2;
         while(s>0 && count>0){
          nums[k]=nums[i-1];
          s--;
          count--;
          k++;
         }
         s=1;
        }
        else{
            s++;
        }
       }
       int count=2;
       while(s>0 && count>0){
        nums[k]=nums[n-1];
        s--;
        count--;
        k++;
       }
       return k;
      
    }
}