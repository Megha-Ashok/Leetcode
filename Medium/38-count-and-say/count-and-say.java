import java.util.HashMap;
class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        if(n==2)return "11";
        String prev="11";
        for(int i=3;i<=n;i++){
        prev=callfun(prev);
        }
        return prev;
    }
    public static String callfun(String prev){
         StringBuilder str=new StringBuilder();
         int count=0;
         char ch=prev.charAt(0);
         for(int i=0;i<prev.length();i++){
            if(ch==prev.charAt(i)){
                count++;
            }
            else{
                str.append(""+count+ch);
                count=1;
                ch=prev.charAt(i);
            }
         }
         str.append(""+count+prev.charAt(prev.length()-1));
         return str.toString();
    }
   
}