class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
      int n=str1.length();
      int m=str2.length();
      if(n<m)return false;
      int i=0,j=0;
        while(i<n && j<m){
            char ch=(char)((((str2.charAt(j)-'a')-1)%26)+'a');
            if(str2.charAt(j)=='a')ch='z';
           if(str1.charAt(i)==str2.charAt(j)){
            i++;
            j++;
           }
           else if(ch==str1.charAt(i)){
            i++;
            j++;
           }
           else 
           i++;
        }
         return j==m;
    }
}