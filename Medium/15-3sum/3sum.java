class Solution {
  //add this into github
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
        int n=nums.length;
      List<List<Integer>>res=new ArrayList<>();
      for(int i=0;i<n;i++){
      if(i>0 && nums[i]==nums[i-1])continue;
       int l=i+1,r=n-1;
       int sum=nums[i];

       while(l<r){
        if(sum+nums[l]+nums[r]<0){
          l++;
        }
        else if(sum+nums[l]+nums[r]>0){
          r--;
        }
        else{
          ArrayList<Integer>arr=new ArrayList<>();
          arr.add(sum);
          arr.add(nums[l]);
          arr.add(nums[r]);
          res.add(arr);
          l++;
          while(l<r && nums[l]==nums[l-1]){
            l++;
          }
        }
       }
      }
      return res;
 
   }
}