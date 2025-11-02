class Solution {
    public int[] getStrongest(int[] arr, int k) {
       Arrays.sort(arr);
       int n=arr.length;
       int mid=(n-1)/2; 
       PriorityQueue<int[]>que=new PriorityQueue<>((a,b)->{
        if(a[0]==b[0])return Integer.compare(b[1],a[1]); 
         return Integer.compare(b[0],a[0]);
       });
       for(int i=0;i<n;i++){
        que.add(new int[]{Math.abs(arr[i]-arr[mid]),arr[i]});
       }
       int res[]=new int[k];
       int count=0;
       while(!que.isEmpty() && count<k){
        res[count++]=que.remove()[1];
       }
       return res;
    }
}