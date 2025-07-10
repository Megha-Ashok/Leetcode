class Solution {
    public int maxDistance(int[] position, int m) {
     Arrays.sort(position);
     int start=1;
     int end=position[position.length-1]-position[0];
     int result=0;
     while(start<=end){
      int mid=start+(end-start)/2;
      if(checkPost(mid,position,m)){
        result=mid;
        start=mid+1;
      }
      else{
        end=mid-1;
      }
     }
     return result;
    }
    public static boolean checkPost(int mid,int position[],int m){
      int prev=position[0];
      int noBall=1;
      for(int i=1;i<position.length;i++){
        if(position[i]-prev>=mid){
          noBall++;
          prev=position[i];
        }
        if(noBall==m)return true;
      }
      return false;
    }
}