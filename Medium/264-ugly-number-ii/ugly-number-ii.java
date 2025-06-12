class Solution {
    public int nthUglyNumber(int n) {
       if(n<=6)return n;
       int arr[]=new int[n+1];
       arr[0]=1;
       int p2=0,p3=0,p5=0;
       int num2=2,num3=3,num5=5;
       for(int i=1;i<=n;i++){
        arr[i]=Math.min(num2,Math.min(num3,num5));
        if(arr[i]==num2){
          p2++;
          num2=arr[p2]*2;
        }
        if(arr[i]==num3){
          p3++;
          num3=arr[p3]*3;
        }
          if(arr[i]==num5){
          p5++;
          num5=arr[p5]*5;
        }
       }
       return arr[n-1];

    }
}