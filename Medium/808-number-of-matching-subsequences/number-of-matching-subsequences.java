class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        HashMap<String,Integer>hash=new HashMap<>();
        for(int i=0;i<words.length;i++){
          if(hash.containsKey(words[i])){
            hash.put(words[i],hash.get(words[i])+1);
          }
          else{
            hash.put(words[i],1);
          }
        }
        for(Map.Entry<String,Integer>set:hash.entrySet()){
            if(isSubsequence(set.getKey(),s)){
            count+=set.getValue();
            }
        }
        return count;
    }
    public static boolean isSubsequence(String str,String s){
        int left=0,right=0;
        while(left<str.length() && right<s.length()){
            if(s.charAt(right)==str.charAt(left)){
                left++;
            }
            right++;
        }
        if(left==str.length())return true;
        return false;
    }
}