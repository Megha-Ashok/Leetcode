class Solution {
    public int totalFruit(int[] fruits) {
       int left=0,right=0;
       int n=fruits.length;
       HashMap<Integer,Integer>set=new HashMap<>();
       int len=0;
       while(right<n){
        if(set.containsKey(fruits[right])){
        set.put(fruits[right],set.get(fruits[right])+1);
        }
        else{
            if(set.size()==2){
                while(left<=right){
                  int value=set.get(fruits[left]);
                  if(value==1){
                    set.remove(fruits[left]);
                    left++;
                    break;
                  }
                  else{
                    set.put(fruits[left],value-1);
                  }
                  left++;
                }
            }
            set.put(fruits[right],1);
        }
        len=Math.max(len,right-left+1);
        right++;
       }
       return len;
    }
}