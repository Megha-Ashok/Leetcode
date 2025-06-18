class Solution {
    public int specialTriplets(int[] nums) {
      int n=nums.length;
      HashMap<Integer,Integer>hash=new HashMap<>();
        for(int i=0;i<n;i++){
              if(hash.containsKey(nums[i])){
                hash.put(nums[i],hash.get(nums[i])+1);
              }
              else{
                hash.put(nums[i],1);
              }
        }
       int count=0;
       HashMap<Integer,Integer>leftcount=new HashMap<>();
       for(int i=0;i<n;i++){
        hash.put(nums[i],hash.get(nums[i])-1);
        int left=0,right=0;
         if(hash.containsKey(nums[i]*2)){
          right=hash.get(nums[i]*2);
         }
         if(leftcount.containsKey(nums[i]*2)){
          left=leftcount.get(nums[i]*2);
         }
         if(leftcount.containsKey(nums[i]))
         leftcount.put(nums[i],leftcount.get(nums[i])+1);
         else 
         leftcount.put(nums[i],1);
         count=(int)((count+(long)left*right)%1000000007);
       }
        return count;
    }
}