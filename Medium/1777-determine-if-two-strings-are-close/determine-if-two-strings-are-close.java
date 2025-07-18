class Solution {
    public boolean closeStrings(String word1, String word2) {
       int len1=word1.length(),len2=word2.length();
        if(len1!=len2)return false;
        int ch1[]=new int[26];
        int ch2[]=new int[26];
        for(int i=0;i<len1;i++){
           ch1[word1.charAt(i)-'a']++;  
           ch2[word2.charAt(i)-'a']++;
        }
        HashMap<Integer,Integer>hash1=new HashMap<>();
        HashMap<Integer,Integer>hash2=new HashMap<>();
        for(int i=0;i<26;i++){
        if(ch1[i]==0){
          if(ch2[i]!=0)return false;
        }
        if(ch2[i]==0){
          if(ch1[i]!=0)return false;
        }
        if(ch1[i]!=0){
          if(hash1.containsKey(ch1[i])){
            hash1.put(ch1[i],hash1.get(ch1[i])+1);
          }
          else{
            hash1.put(ch1[i],1);
          }
        }
        if(ch2[i]!=0){
          if(hash2.containsKey(ch2[i])){
            hash2.put(ch2[i],hash2.get(ch2[i])+1);
          }
          else{
            hash2.put(ch2[i],1);
          }
        }
        }
        for(Map.Entry<Integer,Integer>set:hash1.entrySet()){
          if(hash2.containsKey(set.getKey()) && set.getValue()!=hash2.get(set.getKey()))return false;
          if(!hash2.containsKey(set.getKey()))return false;
        }
        return true;
    }
}