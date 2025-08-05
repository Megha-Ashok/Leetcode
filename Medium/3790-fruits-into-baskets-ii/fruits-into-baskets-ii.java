class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int ans=n;
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            if(baskets[j]>=fruits[i]){
              baskets[j]=0;
              ans--;
              break;
            }
          }
        }
        return ans;

    }
}