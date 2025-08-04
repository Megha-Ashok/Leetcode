class Solution {
    public int maxBalancedShipments(int[] weight) {
     int count=0,max=0;
     for(int i=0;i<weight.length;i++){
        if(weight[i]>=max){
          max=weight[i];
        }
        else{
          max=0;
          count++;
        }
      } 
      return count;
    }
}