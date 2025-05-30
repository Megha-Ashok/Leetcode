class Solution {
  //added
    public int search(int[] nums, int target) {
     int pivot = findPivot(nums,0,nums.length-1);
    int idx=binarySearch(0, pivot - 1, nums, target);
    if(idx!=-1)
    return idx;
    return binarySearch(pivot, nums.length - 1, nums, target);
}

public static int findPivot(int[] arr,int l,int r) {
    int mid=l+(r-l)/2;
    if(l<r){
      if(arr[mid]>arr[r])return findPivot(arr,mid+1,r);
      return findPivot(arr,l,mid);
    }
    return l;
}

public static int binarySearch(int l, int r, int[] arr, int k) {
   int mid=l+(r-l)/2;
   if(l<r){
    if(arr[mid]>k)return binarySearch(l,mid-1,arr,k);
    else if(arr[mid]==k)return mid;
    return binarySearch(mid+1,r,arr,k);
   }
   if(arr[l]==k)return l;
   return -1;
}
}