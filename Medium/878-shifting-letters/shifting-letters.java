class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=s.length();
        long sum=0;
        long val[]=new long[n];
        for(int i=n-1;i>=0;i--){
          val[i]=s.charAt(i)-'a';
          sum+=shifts[i];
          val[i]+=sum;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
          char ch=(char)((val[i]%26)+'a');
          res.append(ch);
        }
        return res.toString();
    }
}