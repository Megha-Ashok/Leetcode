class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int f=0;
        int count=0;
        for(;;){
            f=0;
            if(!s.contains("01"))return count;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                   s=s.substring(0,i)+"10"+s.substring(i+2,s.length());
                    i++;
                    f=1;
                }
            }
            count++; 
        }
        
    }
}