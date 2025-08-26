class Solution {
    public int characterReplacement(String s, int k) {
       int arr[]=new int[26];
       int left=0,right=0,maxLen=0,maxCount=0;
       while(right<s.length()){
        arr[s.charAt(right)-'A']++;
        maxCount=Math.max(maxCount,arr[s.charAt(right)-'A']);
        if((right-left+1)-maxCount>k){
            while(left<=right && (right-left+1)-maxCount>k){
                arr[s.charAt(left)-'A']--;
                maxCount=0;
                for(int i=0;i<26;i++)maxCount=Math.max(maxCount,arr[i]);
                left++;
            }
        }
        if((right-left+1)-maxCount<=k)maxLen=Math.max(maxLen,right-left+1);
        right++;
       }
       return maxLen;
    }
}