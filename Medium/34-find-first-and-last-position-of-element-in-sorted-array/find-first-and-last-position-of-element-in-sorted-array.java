class Solution {
  //added
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        int n=nums.length;
        int val=binarySearch(nums,target,0,n-1);
        if(val==-1){
          arr[0]=-1;
          arr[1]=-1;
          return arr;
        }
        int mid=val;
        while(mid>=0){
          if(nums[mid]!=target)break;
          mid--;
        }
        int high=val;
        while(high<n){
          if(nums[high]!=target)break;
          high++;
        }
        arr[1]=high-1;
        arr[0]=mid+1;
        return arr;
    }
    public static int binarySearch(int nums[],int target,int l,int r){
      if(l<=r){
        int mid=(l+r)/2;
        if(nums[mid]>target)return binarySearch(nums,target,l,mid-1);
        else if(nums[mid]<target)return binarySearch(nums,target,mid+1,r);
        else if(nums[mid]==target)return mid;
      }
      return -1;
    }
}