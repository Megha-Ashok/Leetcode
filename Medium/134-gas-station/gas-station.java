class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int start=0,val=0,totalgas=0,totalcost=0;
     for(int i=0;i<gas.length;i++){
      totalgas+=gas[i];
      totalcost+=cost[i];
      val+=gas[i]-cost[i];
      if(val<0){
        val=0;
        start=i+1;
      }
     } 
     return totalgas-totalcost<0?-1:start;
    } 
}