class Solution {
    public int minimumRefill(int[] nums, int capacityA, int capacityB) {
        int i=0,j=nums.length-1;
        int A=capacityA,B=capacityB,count=0;;
        while(i<j){
          if(nums[i]>A){
            count++;
            A=capacityA-nums[i];
          }
          else A=A-nums[i];
          if(nums[j]>B){
            B=capacityB-nums[j];
            count++;
          }
          else B=B-nums[j];
          i++;
          j--;
        }
        if(i==j){
        if(A>=B && nums[i]>A)count++;
        if(B>A && nums[i]>B)count++;
        }
        return count;
    }
}