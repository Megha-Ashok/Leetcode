class Solution {
    public int longestSubsequence(String s, int k) {
      int n=s.length();
      int len=0,powerValue=1;
      for(int i=n-1;i>=0;i--){
        if(s.charAt(i)=='0'){
          len++;
        }
        else if(powerValue<=k){
          k=k-powerValue;
          len++;
        }
        if(powerValue<=k){
          powerValue*=2;
        }
      }
      return len;
    }
}