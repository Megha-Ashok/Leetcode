class Solution {
    public int compress(char[] chars) {
        int i=0,index=0,count=0;
        char ch=chars[0];
      while(i<chars.length){
        ch=chars[i];
        count=0;
        while(i<chars.length&& chars[i]==ch){
          i++;
          count++;
        }
        chars[index++]=ch;
        if(count>1){
        String temp=count+"";
        for(int j=0;j<temp.length();j++){
         chars[index++]=temp.charAt(j);
        }
        }
      }
      return index;

    }
}