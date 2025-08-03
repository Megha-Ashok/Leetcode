class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!findPalindrome(i,n))return false;
        }
        return true;
    }
    public static boolean findPalindrome(int pow,int n){
        StringBuilder str=new StringBuilder();
        while(n!=0){
          str.append(n%pow);
          n=n/pow;
        }
        String temp=str.toString();
        str.reverse();
        return str.equals(temp);
    }
}