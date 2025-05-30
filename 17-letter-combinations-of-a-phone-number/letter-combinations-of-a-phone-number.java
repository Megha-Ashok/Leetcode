class Solution {
    static String arr[]={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String>res;
    public List<String> letterCombinations(String digits) {
      int n=digits.length();
      if(n==0)return new ArrayList<>();
      res=new ArrayList<>();
      callfun(digits,"",n,0);
      return res;
    }
    public static void callfun(String digit,String str,int n,int idx){
      if(idx==n){
        res.add(str);
        return;
      }
      String temp=arr[digit.charAt(idx)-'1'];
      for(char ch:temp.toCharArray()){
        callfun(digit,str+ch,n,idx+1);
      }
    }
}
/*  ArrayList<String>w=new ArrayList<>();
       String p=arr[digits.charAt(0)-'1'];
        ArrayList<String>q=new ArrayList<>();
            for(int i=0;i<p.length();i++){
               q.add(p.charAt(i)+"");
            }
            for(int k=1;k<digits.length();k++){
            p=arr[digits.charAt(k)-'1'];
             w=new ArrayList<>();
            for(int j=0;j<q.size();j++){
                String l=q.get(j);
            for(int i=0;i<p.length();i++){
                w.add(l+p.charAt(i));
            }
            }
            q=new ArrayList<>(w);
            }
            return q;*/ 