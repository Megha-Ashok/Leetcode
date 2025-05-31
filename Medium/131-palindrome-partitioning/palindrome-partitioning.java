class Solution {
    static List<List<String>>res;
    public List<List<String>> partition(String s) {
      res=new ArrayList<>();
      callfun(0,s,new ArrayList<>());
      return res;
     }
     public static void callfun(int start,String s,ArrayList<String>temp){
        if(start>=s.length()){
          res.add(new ArrayList<>(temp));
          return;
        }
        for(int i=start;i<s.length();i++){
          if(ispalindrome(start,i,s)){
            temp.add(s.substring(start,i+1));
            callfun(i+1,s,temp);
            temp.remove(temp.size()-1);
          }
        }
     }
     public static boolean ispalindrome(int start,int end,String s){
      if(end>=s.length())return false;
      if(end==start)return true;
      while(start<end){
        if(s.charAt(start)!=s.charAt(end))return false;
        start++;
        end--;
      }
      return true;
     }
}