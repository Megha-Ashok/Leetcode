class Solution {
    public int myAtoi(String s) {
    double value=0;
    long max=(long)(Math.pow(2,31)-1);
    long min=-1*(max+1);
     char flag='@';
     boolean flag1=false;
     for(char ch:s.toCharArray()){
      if(!flag1 &&flag=='@'&& ch==' ')continue;
      else if(!flag1 && flag=='@' && (ch=='+'||ch=='-')){
        flag=ch;
        continue;
      }
      else if(Character.isDigit(ch)){
        flag1=true;
        int n=(int)(ch-'0');
        value=value*10+n;
      }
      else break;
     }
    if(flag=='-'){
      value=-1*value;
    }
    if(value>max)return (int)max;
    if(value<min)return (int)min;
    return (int)value;
    }
}