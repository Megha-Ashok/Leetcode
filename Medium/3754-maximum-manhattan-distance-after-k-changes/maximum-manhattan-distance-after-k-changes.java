class Solution {
    
    public int maxDistance(String s, int k) {
      int max=0;
      int east=0,west=0,north=0,south=0;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='E')east++;
        else if(s.charAt(i)=='W')west++;
        else if(s.charAt(i)=='N')north++;
        else south++;
        int step=i+1;
        int val=Math.abs(west-east)+Math.abs(north-south);
        int waste=step-val;
        int extra=0;
        if(waste!=0){
         extra=Math.min(2*k,waste);
        }
        max=Math.max(max,val+extra);
      }
      return max;
    }
   
}