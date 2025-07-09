class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        ArrayList<int []>arr=new ArrayList<>();
        for(int i=0;i<profit.length;i++){
         arr.add(new int[]{profit[i],difficulty[i]});
        }
        Collections.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

        int i=0,j=worker.length-1;
        Arrays.sort(worker);
        int sum=0;
        while(i<profit.length && j>=0){
         int diff=arr.get(i)[1];
         int pro=arr.get(i)[0];
         while(j>=0 && worker[j]>=diff){
          sum+=pro;
          j--;
         }
         i++;
        }
        return sum;
    }
}