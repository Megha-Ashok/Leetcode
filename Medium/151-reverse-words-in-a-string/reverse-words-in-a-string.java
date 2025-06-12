class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        StringBuilder res=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)!=' '){
            str.append(s.charAt(i));
           }
           else{
            if(str.length()>0){
            res.append(str.reverse());
            str=new StringBuilder();
            res.append(" ");
            }
           }
        }
        res.append(str.reverse());
        if(res.charAt(res.length()-1)==' ')res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}