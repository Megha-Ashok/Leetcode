class Solution {
    public int totalFruit(int[] fruits) {
    int first=-1,second=-1;
    int count1=0,count2=0;
    int i=0,j=0;
    int n=fruits.length,max=0;
    while(i<n){
     if(fruits[i]!=first && fruits[i]!=second){
      if(first==-1){
        first=fruits[i];
        count1=1;
      }
      else if(second==-1){
        second=fruits[i];
        count2=1;
      }
      else{
        max=Math.max(max,count1+count2);
        while(j!=i){
         if(fruits[j]==first)count1--;
         else if(fruits[j]==second)count2--;
         if(count1==0 || count2==0)break;
         j++;
        }
        if(count1==0){
          first=fruits[i];
          count1=1;
        }
        else{
          second=fruits[i];
          count2=1;
        }
      }
     }
     else if(fruits[i]==first){
     count1++;
     }
     else{
      count2++;
     }
     i++;
    }
    max=Math.max(max,count1+count2);
    return max;
    }
}