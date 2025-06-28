class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        int noCount=0,prev=0;
        for(int i=0;i<meetings.length;i++){
          if(meetings[i][0]>prev){
            noCount+=meetings[i][0]-prev-1;
            prev=meetings[i][1];
          }
          else if(meetings[i][0]<prev){
            prev=Math.max(prev,meetings[i][1]);
          }
          else{
            prev=Math.max(prev,meetings[i][1]);
          }
        }
        noCount+=days-prev;
        return noCount;
    }
}