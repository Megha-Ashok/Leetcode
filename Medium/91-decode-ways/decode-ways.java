class Solution {
    public int numDecodings(String s) {
     ArrayList<String>arr=new ArrayList<>();
     arr.add("1");
     arr.add("2");
     arr.add("3");
     arr.add("4");
     arr.add("5");
     arr.add("6");
     arr.add("7");
     arr.add("8");
     arr.add("9");
     arr.add("10");
     arr.add("11");
     arr.add("12");
     arr.add("13");
     arr.add("14");
     arr.add("15");
     arr.add("16");
     arr.add("17");
     arr.add("18");
     arr.add("19");
     arr.add("20");
     arr.add("21");
     arr.add("22");
     arr.add("23");
     arr.add("24");
     arr.add("25");
     arr.add("26");
     int prev1=1,prev2=0;
     for(int i=s.length()-1;i>=0;i--){
        int left=0,right=0;
       if(arr.contains(s.charAt(i)+""))left=prev1;
       if(i<s.length()-1 && arr.contains(s.substring(i,i+2)+""))
       right=prev2;
       int temp=left+right;
       prev2=prev1;
       prev1=temp;
     }
     return prev1;
   }
   public static int callfun(String s,ArrayList<String>str,int i,int dp[]){
    if(i==s.length()){
        return dp[i]=1;
    }
    if(dp[i]!=0)return dp[i];
    int left=0,right=0;
    if(str.contains(s.charAt(i)+""))left=callfun(s,str,i+1,dp);
    if(i<s.length()-1 && str.contains(s.substring(i,i+2)+""))
        right=callfun(s,str,i+2,dp);
    return dp[i]=left+right;
    }
}