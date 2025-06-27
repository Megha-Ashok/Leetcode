class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
      int count=0,sum=0;
      HashSet<Integer>hash=new HashSet<>();
    for(int i=0;i<banned.length;i++)hash.add(banned[i]);
     for(int l=1;l<=n;l++){
      if(hash.contains(l))continue;
      if(sum+l<=maxSum){
        sum+=l;
        count++;
      }
      else break;
     }
     return count;
    }
}