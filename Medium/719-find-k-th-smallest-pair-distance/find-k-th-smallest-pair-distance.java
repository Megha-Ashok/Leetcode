class Solution {
    public int smallestDistancePair(int[] nums, int k) {
      Arrays.sort(nums);
      int n=nums.length;
      int min=0;
      int max=nums[n-1];
      int result=max;
      while(min<=max){
        int mid=min+(max-min)/2;
        if(checkSatify(nums,mid,k)){
          result=mid;
          max=mid-1;
        }
        else{
          min=mid+1;
        }
      }
      return result;
    }
    public static boolean checkSatify(int nums[],int mid,int k){
      int countPair=0;
      int n=nums.length;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(nums[j]-nums[i]>mid)break;
          countPair++;
          if(countPair==k)return true;
        }
      }
      return false;
    }
}