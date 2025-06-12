class Solution {
    public String largestNumber(int[] nums) {
      int n=nums.length;
      if(n==1)return ""+nums[0];
      String str[]=new String[n];
      for(int i=0;i<n;i++){
        str[i]=Integer.toString(nums[i]);
      }
      Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
      StringBuilder res=new StringBuilder();
      if(str[0].equals("0"))return "0";
      for(int i=0;i<n;i++){
        res.append(str[i]);
      }
      return res.toString();
    }
}