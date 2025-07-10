class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=0;
       for(int i=0;i<candies.length;i++){
        max=Math.max(max,candies[i]);
       }
        int start=1;
        int end=max;
        int result=0;
        while(start<=end){
          int mid=start+(end-start)/2;
          if(checkPossible(k,candies,mid)){
            result=mid;
            start=mid+1;
          }
          else{
            end=mid-1;
          }
        }
        return result;
    }
    public static boolean checkPossible(long n,int quantities[],int mid){
      long count=0;
      for(int i=0;i<quantities.length;i++){
        int val=quantities[i];
        count+=val/mid;
        if(count>=n)return true;
      }
      return false;
    }
}