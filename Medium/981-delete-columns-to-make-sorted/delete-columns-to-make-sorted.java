class Solution {
    public int minDeletionSize(String[] strs) {
      int count=0;
        for(int j=0;j<strs[0].length();j++){
          String temp="";
          for(int i=0;i<strs.length;i++){
            temp+=strs[i].charAt(j);
          }
          char ch[]=temp.toCharArray();
          Arrays.sort(ch);
          String temp1=new String(ch);
          if(!temp.equals(temp1))count++;
        }
        return count;
    }
}