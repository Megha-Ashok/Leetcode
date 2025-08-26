class Solution {
    public long continuousSubarrays(int[] nums) {
     TreeMap<Integer,Integer>map=new TreeMap<>();
       int left=0,right=0;
       long res=0;
       int n=nums.length;
       while(right<n){
        if(map.containsKey(nums[right])){
            map.put(nums[right],map.get(nums[right])+1);
        }
        else{
            map.put(nums[right],1);
        }
        while(Math.abs(map.lastKey()-map.firstKey())>2){
            int value=map.get(nums[left]);
            if(value==1)map.remove(nums[left]);
            else
            map.put(nums[left],value-1);
            left++;
        }
        res+=(right-left+1);
        right++;
       }
       return res;
    }
}