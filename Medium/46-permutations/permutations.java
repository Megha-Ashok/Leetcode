class Solution {
    public List<List<Integer>> permute(int[] nums) {
   List<List<Integer>> list=new ArrayList<>();
   ArrayList<Integer>arr=new ArrayList<>();
   backtrack(list,arr,nums);
   return list;
}

private void backtrack(List<List<Integer>> list, ArrayList<Integer> tempList, int [] nums){
  if(tempList.size()==nums.length){
    list.add(new ArrayList<>(tempList));
    return;
  }
  for(int i=0;i<nums.length;i++){
    if(!tempList.contains(nums[i])){
     tempList.add(nums[i]);
     backtrack(list,tempList,nums);
     tempList.remove(tempList.size()-1); 
    }
  }
}
}
