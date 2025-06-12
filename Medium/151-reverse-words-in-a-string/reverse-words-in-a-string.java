class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        String temp[]=s.split(" ");
        for(int i=temp.length-1;i>=0;i--){
          if(temp[i].length()>0)str.append(temp[i]+" ");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}