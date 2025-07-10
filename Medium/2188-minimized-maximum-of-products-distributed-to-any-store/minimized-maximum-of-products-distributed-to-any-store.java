class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
       int max=0;
       for(int i=0;i<quantities.length;i++){
        max=Math.max(max,quantities[i]);
       }
        int start=1;
        int end=max;
        int result=0;
        while(start<=end){
          int mid=start+(end-start)/2;
          if(checkPossible(n,quantities,mid)){
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
      for(int i=0;i<quantities.length;i++){
        int val=quantities[i];
        count+=val/mid;
        if(val%mid!=0)count++;
        if(count>n)return false;
      }
      return true;
    }
}