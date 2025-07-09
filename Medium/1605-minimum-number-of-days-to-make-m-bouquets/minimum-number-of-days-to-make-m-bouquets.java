class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
     long start=0;
     long max=0;
     int n=bloomDay.length;
     if(m*k>n)return -1; 
    for(int i=0;i<n;i++){
      max=Math.max(bloomDay[i],max);
    }
    long end=max;
    long result=-1;
    while(start<=end){
      long mid=start+(end-start)/2;
      if(check(mid,bloomDay,m,k)){
        result=mid;
        end=mid-1;
      }
      else{
        start=mid+1;
      }
    }
    return (int)result;
    }
    public static boolean check(long target,int bloom[],int m,int k){
      long result=0,count=0;
      for(int i=0;i<bloom.length;i++){
        if(bloom[i]<=target){
          count++;
        }
        else{
          count=0;
        }
        if(count==k){
          result++;
          count=0;
        }
      }
      if(result>=m)return true;
      return false;
    }
}