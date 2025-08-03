class Solution {
    public int minCut(String s) {
      int dp[][]=new int[s.length()][s.length()];
      for(int i=0;i<s.length();i++)Arrays.fill(dp[i],-1);
    return findSubstring(s,0,0,dp);
    }
    public static int findSubstring(String s,int start,int idx,int dp[][]){
     if(idx==s.length()){
      if(start==idx)return -1;
      if(isPalindrome(s,start,idx-1))return 0;
      return s.length()-1;
     }
     int res=Integer.MAX_VALUE;
     if(dp[start][idx]!=-1)return dp[start][idx];
     if(isPalindrome(s,start,idx)){
      res=1+findSubstring(s,idx+1,idx+1,dp);
     }
     res=Math.min(res,findSubstring(s,start,idx+1,dp));
     return dp[start][idx]=res;
    }
    public static boolean isPalindrome(String s,int start,int end){
      while(start<=end){
        if(s.charAt(start)!=s.charAt(end))return false;
        start++;
        end--;
      }
      return true;
    }

}