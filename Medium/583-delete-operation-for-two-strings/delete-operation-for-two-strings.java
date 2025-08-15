class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        return findStep(word1,word2,0,0,dp);
    }
    public static int findStep(String word1,String word2,int idx1,int idx2,int dp[][]){
        if(idx1==word1.length())return (word2.length()-idx2);
        if(idx2==word2.length())return word1.length()-idx1;
        int res=0;
        if(dp[idx1][idx2]!=-1)return dp[idx1][idx2];
        if(word1.charAt(idx1)==word2.charAt(idx2)){
          res=findStep(word1,word2,idx1+1,idx2+1,dp);
        }
        else{
            res=Math.min(findStep(word1,word2,idx1+1,idx2,dp),findStep(word1,word2,idx1,idx2+1,dp))+1;
        }
        return dp[idx1][idx2]=res;
    }
}