class Solution {

    public int maxArea(int[] height) {
      int max=0;
      int n=height.length;
      int i=0,j=n-1;
     while(i!=j){
        if(height[i]<height[j]){
          max=Math.max(max,height[i]*(j-i));
           i++;
        }
        else{
        max=Math.max(max,height[j]*(j-i));
        j--;
        }
     }
      return max;  
    }
}