class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
       int left=0,right=0;
       int n=colors.length;
       int j=n;
       int arr[]=new int[2*n];
       for(int i=0;i<n;i++)
       arr[i]=colors[i];
       for(int i=0;i<n;i++)
       arr[j+i]=colors[i];
       int count=0;
       boolean flag=false;
       while(left<n){
        flag=false;
        while((right-left+1)<k){
            if(arr[right]==arr[right+1]){
                left=right+1;
                right++;
                break;
            }
            right++;
           if(right-left+1==k)flag=true;
        }
        if(flag){
        count++;
        left++;
        }
       }
       return count; 
    }
}