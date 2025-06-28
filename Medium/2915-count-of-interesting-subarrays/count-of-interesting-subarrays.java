class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int arr[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
          if(nums.get(i)%modulo==k)arr[i]=1;
        }
        int prefix=0;
        long res=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.size();i++){
          if(arr[i]==1)prefix++;
          int curr=prefix%modulo;
          int need=(curr-k+modulo)%modulo;
          if(map.containsKey(need)){
            res+=map.get(need);
          }
          if(map.containsKey(curr)){
            map.put(curr,map.get(curr)+1);
          }
          else{
            map.put(curr,1);
          }
        }
        return res;

    }
}