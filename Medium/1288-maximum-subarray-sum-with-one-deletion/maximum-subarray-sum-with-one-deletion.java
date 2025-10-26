class Solution {
    static int dp[][][];
    public int maximumSum(int[] arr) {
        dp=new int[arr.length][3][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<3;j++){
                Arrays.fill(dp[i][j],Integer.MIN_VALUE);
            }
        }
       return findMaximum(arr,0,0,0); 
    }
    public static int findMaximum(int arr[],int idx,int k,int count){
     if(idx==arr.length){
        if(count>0)
        return 0;
        return Integer.MIN_VALUE;
     }
     if(dp[idx][k][count]!=Integer.MIN_VALUE){
        return dp[idx][k][count];
     }
     int right=Integer.MIN_VALUE;
     int left=right;
     if(k<2){
      left=arr[idx]+findMaximum(arr,idx+1,k,1);
     }
    if(count==0){
    right=findMaximum(arr,idx+1,k,count);
    }
    else if(k==0){
    right=findMaximum(arr,idx+1,1,count); 
    }
    else if(k>=1){
        right=findMaximum(arr,idx+1,2,count);
    }
    return dp[idx][k][count]=Math.max(left,right);
    }
}