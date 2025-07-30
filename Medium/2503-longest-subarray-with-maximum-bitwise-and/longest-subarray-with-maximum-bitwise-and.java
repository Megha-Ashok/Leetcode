class Solution {
    public int longestSubarray(int[] nums) {
        int cont=1,ans=1,max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max==nums[i]){
                cont++;
                ans=Math.max(ans,cont);
            }
            else if(nums[i]>max){
                max=nums[i];
                cont=1;
                ans=1;
            }
            else cont=0;
        }
        return ans;
    }
}