class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        return callfun(nums,nums[0],0);
    }
    public static boolean callfun(int nums[],int val,int i){
        if(i+val>=nums.length-1)return true;
        if(val==0)return false;
        int idx=i;
        int max=Integer.MIN_VALUE;
        for(int j=1;j<=val && i+j<nums.length;j++){
            if(max<(nums[i+j]+i+j)){
                idx=i+j;
                max=nums[i+j]+i+j;
            }
        }
        return callfun(nums,nums[idx],idx);
    }
}