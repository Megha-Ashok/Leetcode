class Solution {
    //added
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(matrix[i][m-1]==target)return true;
            if(matrix[i][m-1]>target){
                return callfun(matrix[i],target,0,m);
            }
        }
        return false;
    }
    public static boolean callfun(int arr[],int target,int start,int end){
        int mid=(start+end)/2;
        if(start>end){
            return false;
        }
        if(arr[mid]==target)return true;
         if(arr[mid]<target) return callfun(arr,target,mid+1,end);
         return callfun(arr,target,start,mid-1);
    }
}