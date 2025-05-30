class Solution {
    public int jump(int[] nums) {
      return callfun(0,nums[0],nums);
    }
    public static int callfun(int i,int value,int nums[]){
        if(i==nums.length-1)return 0; 
        if(value==0)return Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int idx=i;
        if(i+value>=nums.length-1)return 1;
        for(int j=1;j<=value && i+j<nums.length;j++){
        int val=nums[i+j];
          if(max<val+i+j){
            max=i+j+val;
            idx=i+j;
          }
        }
        return callfun(idx,nums[idx],nums)+1;
    }
}