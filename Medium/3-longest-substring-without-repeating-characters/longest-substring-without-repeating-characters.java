class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character>set=new HashSet<>();
      int left=0,right=0;
      int len=0;
      while(right<s.length()){
       if(set.contains(s.charAt(right))){
        while(left<=right){
            set.remove(s.charAt(left));
          if(s.charAt(left)==s.charAt(right)){
            left++;
            break;
          }
          left++;
        }
       }
       set.add(s.charAt(right));
       len=Math.max(len,right-left+1);
       right++;
      } 
      return len;
    }
}