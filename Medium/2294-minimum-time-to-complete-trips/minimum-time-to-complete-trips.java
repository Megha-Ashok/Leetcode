class Solution {
    public long minimumTime(int[] time, int totalTrips) {
      Arrays.sort(time);
      int n=time.length;
      long start=1;
      long end=(long)time[0]*10000000;
      long result=0;
      while(start<=end){
        long mid=start+(end-start)/2;
        if(checkPossible(mid,time,totalTrips)){
          result=mid;
          end=mid-1;
        }
        else{
          start=mid+1;
        }
      }
      return result;
    }
    public static boolean checkPossible(long mid,int time[],int total){
      long count=0;
      for(int i=0;i<time.length;i++){
        count+=mid/time[i];
        if(count>=total)return true;
      }
      return false;
    }
}