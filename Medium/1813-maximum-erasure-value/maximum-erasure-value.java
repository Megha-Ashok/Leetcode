class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0,r=0;
        int n=nums.length,sum=0;
        int res=0;
        HashSet<Integer>hash=new HashSet<>();
        while(r<n){
          if(hash.contains(nums[r])){
            res=Math.max(res,sum);
            while(l<=r && nums[l]!=nums[r]){
              hash.remove(nums[l]);
              sum-=nums[l];
              l++;
            }
            l++;
          }
          else{
            hash.add(nums[r]);
            sum+=nums[r];
          }
          r++;
        }
        res=Math.max(res,sum);
        return res;
    }
}