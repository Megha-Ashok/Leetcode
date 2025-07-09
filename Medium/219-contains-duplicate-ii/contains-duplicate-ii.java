class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer,Integer>hash=new HashMap<>();
    for(int i=0;i<nums.length;i++){
      if(hash.containsKey(nums[i])){
          if(i-hash.get(nums[i])<=k)return true;
          hash.put(nums[i],i);
      }
      else{
        hash.put(nums[i],i);
      }
    } 
    return false;
    }
}