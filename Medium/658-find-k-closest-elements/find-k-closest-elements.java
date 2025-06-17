class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    Queue<Integer>que=new LinkedList<>();
    List<Integer>res=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      if(k>0){
        que.add(arr[i]);
        k--;
      }
      else{
        if(Math.abs(que.peek()-x)>Math.abs(arr[i]-x)){
          que.poll();
          que.add(arr[i]);
        }
      }
    }
    while(!que.isEmpty()){
      res.add(que.poll());
    }
    return res;
    }
}