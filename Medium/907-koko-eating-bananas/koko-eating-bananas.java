class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long min=1,max=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            max+=piles[i];
        }
        long res=max;
        while(min<=max){
            long mid=min+(max-min)/2;
            if(Possible(mid,piles,h)){
                max=mid-1;
                res=mid;
            }
            else{
                min=mid+1;
            }
        }
        return (int)res;
    }
    public static boolean Possible(long mid,int piles[],int h){
        int idx=0,hour=0;
        while(idx<piles.length){
            long rem=piles[idx]%mid;
            if(rem>0)hour++;
            hour+=piles[idx]/mid;
            if(hour>h)return false;
            idx++;
        }
        return true;
    }
}