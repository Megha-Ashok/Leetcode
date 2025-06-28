class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       ArrayList<Integer>lessVal=new ArrayList<>();
       ArrayList<Integer>greaterVal=new ArrayList<>();
       ArrayList<Integer>pivotVal=new ArrayList<>();
       int res[]=new int[nums.length];
       for(int val:nums){
        if(val>pivot){
          greaterVal.add(val);
        }
        else if(val<pivot){
          lessVal.add(val);
        }
        else{
          pivotVal.add(pivot);
        }
       } 
      int k=0;
      for(int i=0;i<lessVal.size();i++){
        res[k++]=lessVal.get(i);
      }
      
      for(int i=0;i<pivotVal.size();i++){
        res[k++]=pivotVal.get(i);
      }
      for(int i=0;i<greaterVal.size();i++){
        res[k++]=greaterVal.get(i);
      }
      return res;
    }
}