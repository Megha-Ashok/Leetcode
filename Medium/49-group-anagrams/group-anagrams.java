class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>res=new HashMap<>();
        for(String str:strs){
          char ch[]=str.toCharArray();
          Arrays.sort(ch);
          String p=new String(ch);
          if(!res.containsKey(p)){
            res.put(p,new ArrayList<>());
          }
          res.get(p).add(str);
        }
        return new ArrayList<>(res.values());
    }
}