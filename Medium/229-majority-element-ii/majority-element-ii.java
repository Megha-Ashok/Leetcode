class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int n=nums.length/3;
        HashMap<Integer,Integer>arr1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
             if(arr1.containsKey(nums[i])){
                if(arr1.get(nums[i])>n)continue;
                arr1.replace(nums[i],arr1.get(nums[i])+1);
             }
             else{
                arr1.put(nums[i],1);
             }
             if(arr1.get(nums[i])>n)arr.add(nums[i]);
        }
        return arr;
    }
}