class Solution {
    public List<String> partitionString(String s) {
      List<String>res=new ArrayList<>();
      HashSet<String>set=new HashSet<>();
      int r=0;
      int n=s.length();
      while(r<n){
        StringBuilder str=new StringBuilder();
        str.append(s.charAt(r));
        while(r+1<n && set.contains(str.toString())){
          r++;
          str.append(s.charAt(r));
        }
        r++;
        String temp=new String(str.toString());
        if(!set.contains(temp)){
        set.add(temp);
        res.add(temp);
        }
      }
      return res;
    }
}