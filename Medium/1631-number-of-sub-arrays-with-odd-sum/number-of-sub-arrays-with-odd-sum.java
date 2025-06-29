class Solution {
    public int numOfSubarrays(int[] arr) {
     int odd=0;
     int even=1;
     int count=0;
     int sum=0;
     int M=1000000007;
     for(int i=0;i<arr.length;i++){
      sum+=arr[i];
      if(sum%2==0){
        count=(count+odd)%M;
        even++;
      }
      else{
        count=(count+even)%M;
        odd++;
      }
     }
     return count;
    }
}