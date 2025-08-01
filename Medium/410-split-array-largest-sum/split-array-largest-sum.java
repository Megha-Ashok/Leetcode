class Solution {
    public int splitArray(int[] nums, int k) {
     int low=0;
     int high=0,sum=0;
     for(int i=0;i<nums.length;i++){
      sum+=nums[i];
      low=Math.max(low,nums[i]);
     }
     high=sum;
     while(low<=high){
      int mid=low+(high-low)/2;
      int value=checkPossible(mid,nums,k);
      if(value==1){
        high=mid-1;
      }
      else if(value==2){
        low=mid+1;
      }
      else 
      high=mid-1;
     }
     return low;
    }
    public static int checkPossible(int mid,int nums[],int k){
      int sum=0,count=0;
    for(int i=0;i<nums.length;i++){
      sum+=nums[i];
      if(sum>mid){
        count++;
        sum=nums[i];
      }
    }
    if(count+1==k)return 1;
    else if(count+1<k)return 3;
    return 2;
    }
}