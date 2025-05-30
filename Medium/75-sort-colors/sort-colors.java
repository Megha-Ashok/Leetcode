class Solution {
    //added

    public void sortColors(int[] nums) {
        int numOne=0;
        int numZero=0;
        int numTwo=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)numZero++;
            else if(nums[i]==1)numOne++;
            else numTwo++;
        }
        int k=0;
        while(numZero>0){
            numZero--;
           nums[k++]=0;
        }
        while(numOne>0){
            numOne--;
           nums[k++]=1;
        }while(numTwo>0){
            numTwo--;
           nums[k++]=2;
        }
    }
}