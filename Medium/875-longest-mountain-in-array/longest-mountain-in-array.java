class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int max=0;
        for(int i=1;i<n-1;i++){
            int left=i-1,right=i+1;
            while(left>=0){
                if(arr[left]>=arr[left+1])break;
                left--;
            }
            if(left==i-1)continue;
            left++;
            while(right<n){
             if(arr[right]>=arr[right-1])break;
             right++;
            }
            if(right==i+1)continue;
            right--;
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}