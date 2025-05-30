class Solution {
     //add github
    public String longestPalindrome(String s) {
        if(s.length()==0)return "";
     String findSubstring=s.charAt(0)+"";
     for(int i=0;i<s.length();i++){
        int low=i;
        int high=i;
        while(s.charAt(low)==s.charAt(high)){
            low--;
            high++;
            if(low<0 || high==s.length())break;
        }
        String temp=s.substring(low+1,high);
        if(temp.length()>findSubstring.length()){
            findSubstring=temp;
        }
       low=i-1;
       high=i;
         while(low>=0 && high!=s.length() && s.charAt(low)==s.charAt(high)){
            low--;
            high++;
         }
        temp=s.substring(low+1,high);
        if(temp.length()>findSubstring.length()){
            findSubstring=temp;
        }

     }
       return findSubstring;
    }
}