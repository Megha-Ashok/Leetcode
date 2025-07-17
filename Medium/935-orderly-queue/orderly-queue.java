class Solution {
    public String orderlyQueue(String s, int k) {
      if(k==1)return findString(s);
      char ch[]=s.toCharArray();
      Arrays.sort(ch);
      String res=new String(ch);
      return res;  
    }
    public static String findString(String s){
        String prev=s;
        int n=s.length();
        for(int i=0;i<n;i++){
            String temp=s.substring(i,n)+s.substring(0,i);
          if(prev.compareTo(temp)>0){
            prev=temp;
          }
        }
        return prev;
    }
}