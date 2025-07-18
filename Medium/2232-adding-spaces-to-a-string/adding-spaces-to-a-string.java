class Solution {
    public String addSpaces(String s, int[] spaces) {
       StringBuilder res=new StringBuilder();
       res.append(s.substring(0,spaces[0]));
       int n=spaces.length;
       for(int i=0;i<n-1;i++){
       res.append(" ");
       res.append(s.substring(spaces[i],spaces[i+1]));
       } 
       res.append(" ");
       res.append(s.substring(spaces[n-1]));
       return res.toString();
    }
}