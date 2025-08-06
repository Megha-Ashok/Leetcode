class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n=matrix.length;
      int m=matrix[0].length;
      for(int i=0;i<m;i++){
        if(matrix[n-1][i]==target)return true;
        if(matrix[n-1][i]>target){
          if(binarySearch(0,n-1,i,target,matrix))return true;
         }
      }
      return false;
    }
    public static boolean binarySearch(int start,int end,int col,int target,int matrix[][]){
     while(start<=end){
      int mid=start+(end-start)/2;
      if(matrix[mid][col]>target){
        end=mid-1;
      }
      else if(matrix[mid][col]==target)return true;
      else{
        start=mid+1;
      }
     }
     return false;
    }
}