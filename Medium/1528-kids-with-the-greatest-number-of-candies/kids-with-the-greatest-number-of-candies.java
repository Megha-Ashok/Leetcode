class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int large=0;
      for(int candy:candies){
        large=Math.max(large,candy);
      }
      List<Boolean>res=new ArrayList<>();
      for(int i=0;i<candies.length;i++){
        if(candies[i]+extraCandies>=large)res.add(true);
        else res.add(false);
      }
      return res;
    }
}