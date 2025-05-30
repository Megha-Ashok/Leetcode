class Solution {
    //added
    public boolean isInterleave(String s1, String s2, String s3) {
        int k1=s1.length(),l1=s2.length(),m1=s3.length();
        int dp[][][]=new int[k1+1][l1+1][m1+1];
        return callfun(s1,s2,s3,0,0,0,k1,l1,m1,dp);
    }

public static boolean callfun(String s1,String s2,String s3,int i,int j,int k,int n1,int n2,int n3,int dp[][][]){
    if(k==s3.length() && j==s2.length() && i==s1.length()){
        dp[i][j][k]=1;
        return true;
    }
    if(k!=s3.length() && j==s2.length() && i==s1.length()){
        dp[i][j][k]=2;
        return false;
    }
    if(k==s3.length() &&(j!=s2.length() || i!=s1.length())){
        dp[i][j][k]=2;
        return false;
    }
    boolean left=false,right=false;
    if(dp[i][j][k]!=0){
        if(dp[i][j][k]==1)return true;
        return false;
    }
    if(i<s1.length() && s1.charAt(i)!=s3.charAt(k) && j<s2.length() &&  s2.charAt(j)!=s3.charAt(k)){
        dp[i][j][k]=2;
        return false;
    }
    if(i<s1.length() && s1.charAt(i)==s3.charAt(k))left=callfun(s1,s2,s3,i+1,j,k+1,n1,n2,n3,dp);
    if(j<s2.length() && s2.charAt(j)==s3.charAt(k))right=callfun(s1,s2,s3,i,j+1,k+1,n1,n2,n3,dp);
     if(left||right)dp[i][j][k]=1;
     else dp[i][j][k]=2;
     return left||right;
    }
}