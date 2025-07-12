class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>hash=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
          hash.add(nums[i]);
        }
        int size=hash.size();
        int start=0;
        int end=0;
        int res=0;
        HashMap<Integer,Integer>data=new HashMap<>();
        while(end<n){
          if(data.containsKey(nums[end])){
          data.put(nums[end],data.get(nums[end])+1);
          }
          else{
            data.put(nums[end],1);
          }
         while(data.size()==size){
          res+=(n-end);
          data.put(nums[start],data.get(nums[start])-1);
          if(data.get(nums[start])==0){
            data.remove(nums[start]);
          }
          start++;
         }
         end++;
        }
        return res;

    }
}