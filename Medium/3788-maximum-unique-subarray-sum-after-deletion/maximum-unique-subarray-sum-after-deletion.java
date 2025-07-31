class Solution {
    public int maxSum(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        HashSet<Integer>hash=new HashSet<>();
        for(int num:nums){
          if(num>0){
            hash.add(num);
         }
         max=Math.max(max,num);
        }
        if(hash.size()==0)return max;
       for(int val:hash){
        sum+=val;
       }
       return sum;
    }
}