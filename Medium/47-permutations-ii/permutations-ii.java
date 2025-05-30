class Solution {
    static List<List<Integer>>res;
    //added
    public List<List<Integer>> permuteUnique(int[] nums) {
        res=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        callfun(nums,arr);
        return res;
    }
    public static void callfun(int nums[],ArrayList<Integer>arr){
        if(arr.size()==nums.length){
             ArrayList<Integer>temp=new ArrayList<>();
             for(int i=0;i<nums.length;i++){
                 temp.add(nums[arr.get(i)]);
             }
            if(!res.contains(temp)){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(i)){
                arr.add(i);
                callfun(nums,arr);
                arr.remove(arr.size()-1);
            }
        }   
    }
}