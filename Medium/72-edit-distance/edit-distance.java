class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length(),n=word2.length();
        if(m==0)return n;
        if(n==0)return m;
        int dp[]=new int[n+1];
        int temp[]=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=i;
        }
            for(int i=1;i<=m;i++){
                temp[0]=i;
                for(int j=1;j<=n;j++){
             if(word1.charAt(i-1)==word2.charAt(j-1)){
                temp[j]=dp[j-1];
             }
             else temp[j]=1+Math.min(temp[j-1],Math.min(dp[j],dp[j-1]));
            }
            for(int k=0;k<=n;k++){
                dp[k]=temp[k];
            }
        }
       return temp[n];
    }
    public static int callfun(String word1,String word2,int m,int n,int dp[][]){
        if(m==0)return n;
        if(n==0)return m;
        if(dp[m][n]!=0)return dp[m][n];
        if(word1.charAt(m-1)==word2.charAt(n-1))return dp[m][n]=callfun(word1,word2,m-1,n-1,dp);
         return dp[m][n]=1+Math.min(callfun(word1,word2,m,n-1,dp),Math.min(callfun(word1,word2,m-1,n,dp),callfun(word1,word2,m-1,n-1,dp)));
    }
}