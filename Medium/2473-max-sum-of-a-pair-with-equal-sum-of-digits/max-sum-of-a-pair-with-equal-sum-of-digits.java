class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        int max=-1;
        for(int num:nums){
          int val=num;
          int sum=0;
          while(num!=0){
            int rem=num%10;
            num=num/10;
            sum+=rem;
          }
          if(hash.containsKey(sum)){
            if(max<hash.get(sum)+val){
              max=hash.get(sum)+val;
            }
            val=Math.max(hash.get(sum),val);
            hash.put(sum,val);
          }
          else{
            hash.put(sum,val);
          }
        }
        return max;
    }
}