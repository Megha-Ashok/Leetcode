class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
          if(s.charAt(i)!=s.charAt(j))break;
          if(s.charAt(i)==s.charAt(j)){
            char ch=s.charAt(i);
            int count=i;
            while(i<j && s.charAt(i)==ch)i++;
            while(j>count && ch==s.charAt(j))j--;
          }
        }
        if(i>j)return 0;
        return j-i+1;
    }
}