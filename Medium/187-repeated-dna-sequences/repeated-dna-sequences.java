class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer>hash=new HashMap<>();
        int i=0,j=10;
        int n=s.length();
        while(j<=n){
         String temp=s.substring(i,j);
         if(hash.containsKey(temp)){
          hash.put(temp,hash.get(temp)+1);
         }
         else{
          hash.put(temp,1);
         }
         i++;
         j++;
        }
        List<String>res=new ArrayList<>();
        for(Map.Entry<String,Integer>set:hash.entrySet()){
          if(set.getValue()>1){
            res.add(set.getKey());
          }
        }
        return res;

    }
}