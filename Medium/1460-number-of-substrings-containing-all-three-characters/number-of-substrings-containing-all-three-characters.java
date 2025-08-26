class Solution {
    public int numberOfSubstrings(String s) {
        int left=0,right=0;
        HashMap<Character,Integer>hash=new HashMap<>();
        int n=s.length();
        int count=0;
        while(right<n){
            if(hash.containsKey(s.charAt(right))){
                hash.put(s.charAt(right),hash.get(s.charAt(right))+1);
            }
            else{
                hash.put(s.charAt(right),1);
            }
            if(hash.size()==3){
                while(left<=right){
                    count+=(n-right);
                    int value=hash.get(s.charAt(left));
                    if(value==1){
                        hash.remove(s.charAt(left));
                        left++;
                        break;
                    }
                    hash.put(s.charAt(left),value-1);
                    left++;
                }
            }
            right++;
        }
        return count;
    }
}