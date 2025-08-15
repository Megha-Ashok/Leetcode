class Solution {
    public int countArrangement(int n) {
    return findBeautiful(n,1,new int[n+1]);
    }
    public static int findBeautiful(int n,int idx,int visit[]){
        if(idx>n)return 1;
        int count=0;
        for(int i=1;i<=n;i++){
            if(visit[i]!=1){
              if(i%idx==0 || idx%i==0){
                visit[i]=1;
                count+=findBeautiful(n,idx+1,visit);
                visit[i]=0;
              }
            }
        }
        return count;
    }
}