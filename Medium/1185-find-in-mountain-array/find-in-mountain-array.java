/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        return findIndex(target,mountainArr,0,mountainArr.length()-1);
    }
    public static int findIndex(int target,MountainArray mountainArr,int start,int end){
      int peak=findPeak(mountainArr,0,end);
      if(mountainArr.get(peak)==target)return peak;
      int left=BinarySearch(target,mountainArr,start,peak-1);
      if(left!=-1)return left;
      return ReverseBinarySearch(target,mountainArr,peak+1,end);
    }
    public static int findPeak(MountainArray mountainArr,int start,int end){
     int low=start,high=end;
     while(low<=high){
      int mid=low+(high-low)/2;
      if(mid+1<=end && mountainArr.get(mid)<mountainArr.get(mid+1)){
        low=mid+1;
      }
      else if(mid+1<=end && mountainArr.get(mid)>mountainArr.get(mid+1)){
        high=mid-1;
      }
      else if(mid-1>=0 && mid+1<=end && mountainArr.get(mid)>mountainArr.get(mid+1) && mountainArr.get(mid-1)<mountainArr.get(mid))return mid;
     }
     return low;
    }
    public static int BinarySearch(int target,MountainArray mountainArr,int start,int end){
      while(start<=end){
        int mid=start+(end-start)/2;
        if(mountainArr.get(mid)>target)
        end=mid-1;
        else if(mountainArr.get(mid)<target)
        start=mid+1;
        else return mid;
      }
      return -1;
    }
    public static int ReverseBinarySearch(int target,MountainArray mountainArr,int start,int end){
      while(start<=end){
        int mid=start+(end-start)/2;
        if(mountainArr.get(mid)<target)
        end=mid-1;
        else if(mountainArr.get(mid)>target)
        start=mid+1;
        else return mid;
      }
      return -1;
    }
}