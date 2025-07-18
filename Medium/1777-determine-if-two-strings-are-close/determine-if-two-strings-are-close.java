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
        for(int i=0;i<26;i++){
          if((ch1[i]!=0 && ch2[i]!=0)|| (ch1[i]==0 && ch2[i]==0))continue;
          return false;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}