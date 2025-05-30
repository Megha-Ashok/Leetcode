class Solution {
  //added to github
    public int lengthOfLongestSubstring(String s) {
      if(s.length()==0)return 0;
      if(s.length()==1)return 1;
      HashMap<Character,Integer>hash=new HashMap<>();
      int max=0;
      int n=s.length();
      int left=0;
      for(int i=0;i<n;i++){
        if(!hash.containsKey(s.charAt(i)))
          hash.put(s.charAt(i),i);
        else{
         int idx1=hash.get(s.charAt(i));
          max=Math.max(max,i-left);
         while(left<=idx1){
          hash.remove(s.charAt(left));
          left++;
         }
         left=idx1+1;
         hash.put(s.charAt(i),i);
        }
      }
      max=Math.max(max,hash.size());
      return max;
    }
}