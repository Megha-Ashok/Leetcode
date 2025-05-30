class Solution {
    //added
    static List<String>arr;
    public List<String> restoreIpAddresses(String s) {
        if(s.length()>12)return new ArrayList<>();
        StringBuilder str=new StringBuilder();
       arr =new ArrayList<>();
        if(s.length()==12){
            for(int i=0;i<s.length();i+=3){
               int n=Integer.parseInt(s.substring(i,i+3));
               if(n>255)return new ArrayList<>();
               str.append(""+n+".");
            }
            str.deleteCharAt(str.length()-1);
            arr.add(str.toString());
            return arr;
        }
        callfun(s,"",0);
        return arr;
    }
    public static void callfun(String s,String p,int count){
        if(s.length()==0 && count==4){
            StringBuilder p1=new StringBuilder(p);
            p1.deleteCharAt(p1.length()-1);
            arr.add(p1.toString());
            return;
        }
        if(count==4 ||  s.length()==0)return;
        if((int)s.charAt(0)<=255){
            callfun(s.substring(1),p+s.charAt(0)+".",count+1);
        }
        if(s.length()>=2 && s.charAt(0)!='0' && Integer.parseInt(s.substring(0,2))<=255){
           callfun(s.substring(2),p+s.substring(0,2)+".",count+1); 
        }
        if(s.length()>=3 && s.charAt(0)!='0' && Integer.parseInt(s.substring(0,3))<=255){
           callfun(s.substring(3),p+s.substring(0,3)+".",count+1); 
        }
    }
}