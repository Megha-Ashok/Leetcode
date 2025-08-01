class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer>ans=new HashSet<>();
        Set<Integer>curr=new HashSet<>();
        curr.add(0);
        for(Integer x:arr){
            Set<Integer>cur2=new HashSet<>();
            for(Integer y:curr){
                cur2.add(x|y);
            }
            cur2.add(x);
            curr=cur2;
            ans.addAll(curr);
        }
        return ans.size();
    }
}