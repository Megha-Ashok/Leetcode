class Solution {
    //added
    public int romanToInt(String s) {
        int sum=0,ans=0;
        for(int i=s.length()-1;i>=0;i--){
             switch(s.charAt(i)){
                 case 'I':
                 sum=1;
                 break;
                 case 'V':
                 sum=5;
                 break;
                
                 case 'X':
                 sum=10;
                 break;
                 case 'L':
                 sum=50;
                 break;
                 case 'C':
                 sum=100;
                 break;
                 case 'D':
                 sum=500;
                 break;
                 case 'M':
                 sum=1000;
                 break;
             }
             if(4*sum<ans)
             ans=ans-sum;
             else
             ans+=sum;
        }
        return ans;
    }
}