class Solution {
    static int dp[][];
    public int findLength(int[] nums1, int[] nums2) {
        dp=new int[nums1.length][nums2.length];
        for(int i=0;i<nums1.length;i++){
            Arrays.fill(dp[i],-1);
        }
    return findLength(nums1,nums2,0,0); 
    }
    public static int findLength(int num1[],int num2[],int idx1,int idx2){
        if(idx1==num1.length || idx2==num2.length)return 0;
        int result=0;
        if(dp[idx1][idx2]!=-1)return dp[idx1][idx2];
        if(num1[idx1]==num2[idx2]){
            int left=idx1,right=idx2;
            while(left<num1.length && right<num2.length && num1[left]==num2[right]){
                left++;
                right++;
            }
        result=left-idx1;
        }
        result=Math.max(result,findLength(num1,num2,idx1+1,idx2));
        result=Math.max(result,findLength(num1,num2,idx1,idx2+1));
        return dp[idx1][idx2]=result;     
    }
}