class Solution {
    public int leastBricks(List<List<Integer>> wall) {
      HashMap<Integer,Integer>hash=new HashMap<>();
      for(int i=0;i<wall.size();i++){
        int sum=0;
        for(int j=0;j<wall.get(i).size()-1;j++){
          sum+=wall.get(i).get(j);
          if(hash.containsKey(sum)){
            hash.put(sum,hash.get(sum)+1);
          }
          else{
            hash.put(sum,1);
          }
        }
      }
      int max=0;
      for(Map.Entry<Integer,Integer>set:hash.entrySet()){
        max=Math.max(max,set.getValue());
      }
      return wall.size()-max;
    }
}