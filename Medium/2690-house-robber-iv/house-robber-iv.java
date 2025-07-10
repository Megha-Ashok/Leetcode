class Solution {
    public int minCapability(int[] nums, int k) {
             int max=0;
             int start=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        start=Math.min(start,nums[i]);
       }
        
        int end=max;
        int result=0;
        while(start<=end){
          int mid=start+(end-start)/2;
          if(checkPossible(k,nums,mid)){
            result=mid;
            end=mid-1;
          }
          else{
            start=mid+1;
          }
        }
        return result;
    }
    public static boolean checkPossible(int n,int quantities[],int mid){
      int count=0;
      int i=0;
      while(i<quantities.length){
        if(quantities[i]<=mid){
          i+=2;
          count++;
        }
        else i++;
        if(count>=n)return true;
      }
      return false;
    }
}