class Solution {
    public int edgeScore(int[] edges) {
      int n=edges.length;
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
          arr[edges[i]]+=i;
        }
        long max=0,res=0;
        for(int i=0;i<n;i++){
          if(arr[i]>max){
            res=i;
            max=arr[i];
          }
        }
        return (int)res;
    }
}