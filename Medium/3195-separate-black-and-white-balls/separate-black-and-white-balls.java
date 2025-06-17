class Solution {
    public long minimumSteps(String s) {
        long swap=0,black=0;
        for(int c:s.toCharArray()){
          if(c=='0'){
            swap+=black;
          }
          else{
            black++;
          }
        }
        return swap;
    }
}