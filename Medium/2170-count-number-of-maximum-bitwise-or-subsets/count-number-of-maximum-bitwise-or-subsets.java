class Solution {
     static  int count;
    public int countMaxOrSubsets(int[] nums) {
      int maxBit=nums[0];
      count=0;
      for(int i=1;i<nums.length;i++)maxBit|=nums[i];
      findSubset(nums,0,maxBit,new ArrayList<>());
      return count;
    }
    public static void findSubset(int nums[],int idx,int maxBit,ArrayList<Integer>ele){
      if(idx==nums.length){
        if(ele.size()==0)return;
        int max=ele.get(0);
        for(int i=1;i<ele.size();i++)max|=ele.get(i);
        if(max==maxBit)count++;
        return ;
      }
      ele.add(nums[idx]);
      findSubset(nums,idx+1,maxBit,ele);
      ele.remove(ele.size()-1);
      findSubset(nums,idx+1,maxBit,ele);
    }
}