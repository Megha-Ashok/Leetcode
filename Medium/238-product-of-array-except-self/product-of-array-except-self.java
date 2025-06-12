class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int mul=1;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            else
            mul*=nums[i];
        }
        int res[]=new int[n];
        if(count==n)return res;
        for(int i=0;i<n;i++){
            if(count>0){     
           if(nums[i]==0 && count==1){
            res[i]=mul;
           }
           else
           res[i]=0;
            }
            else{
                res[i]=mul/nums[i];
            }
        }
        return res;
    }
}