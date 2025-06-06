class Solution {
    public int edgeScore(int[] edges) {
        HashMap<Long,Long>hash=new HashMap<>();
        long max=0;
        for(int i=0;i<edges.length;i++){
          if(hash.containsKey((long)edges[i])){
            long val=hash.get((long)edges[i]);
            hash.put((long)edges[i],val+i);
            max=Math.max(max,val+i);
          }
          else{
            hash.put((long)edges[i],(long)i);
            max=Math.max(max,i);
          }
        }
        long res=edges.length+1;
        for(Map.Entry<Long,Long>set:hash.entrySet()){
         if(max==set.getValue()){
          res=Math.min(res,set.getKey());
         }
        }
        return (int)res;
    }
}