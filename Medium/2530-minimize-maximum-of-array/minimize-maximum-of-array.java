class Solution {
    public int minimizeArrayValue(int[] nums) {
      long min=0,max=0;
      for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
      }  
      long res=max;
      while(min<=max){
        long mid=min+(max-min)/2;
        if(Possible(mid,nums)){
            res=mid;
            max=mid-1;
        }
        else{
            min=mid+1;
        }
      }
      return (int)res;
    }
    public static boolean Possible(long mid,int nums[]){
     int n=nums.length;
     long arr[]=new long[n];
     for(int i=0;i<n;i++)arr[i]=nums[i];
    for(int i=0;i<n-1;i++){
        if(arr[i]>mid)return false;
        long buffer=mid-arr[i];
        arr[i+1]=arr[i+1]-buffer;
    }
    return arr[n-1]<=mid;
    }
}