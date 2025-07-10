class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
      Arrays.sort(items,(a,b)->Integer.compare(a[0],b[0]));
       int maxBeauty=items[0][1];
       for(int i=1;i<items.length;i++){
        maxBeauty=Math.max(maxBeauty,items[i][1]);
        items[i][1]=maxBeauty;
       }
      int n=queries.length;
      int result[]=new int[n];
      for(int i=0;i<n;i++){
        result[i]=findMaximumBeauty(queries[i],items);
      }
      return result;
    }
    public static int findMaximumBeauty(int price,int items[][]){
      int start=0;
      int end=items.length-1;
      int result=0;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(items[mid][0]<=price){
          result=items[mid][1];
          start=mid+1;
        }
        else{
          end=mid-1;
        }
      }
      return result;
    }

}