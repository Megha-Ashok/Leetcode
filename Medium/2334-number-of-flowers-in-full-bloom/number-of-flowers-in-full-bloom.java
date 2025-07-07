class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
      ArrayList<Integer>start=new ArrayList<>();
      ArrayList<Integer>end=new ArrayList<>();
      for(int i=0;i<flowers.length;i++){
        start.add(flowers[i][0]);
        end.add(flowers[i][1]);
      }  
      Collections.sort(start);
      Collections.sort(end);
      int res[]=new int[people.length];
      for(int i=0;i<people.length;i++){
        int end1=binarySearch(start,people[i]);
        System.out.println(end1);
        int start1=findStart(end,people[i],end1);
        res[i]=end1-start1;
      }
      return res;
    }
    public static int findStart(ArrayList<Integer>end,int time,int index){
      int l=0,r=index;
      while(l<=r){
        int mid=l+(r-l)/2;
        if(end.get(mid)>=time){
           r=mid-1;
        }
        else if(end.get(mid)<time){
          l=mid+1;
        }
      }
      if(l>r)return l-1;
      return l;
    }
    public static int binarySearch(ArrayList<Integer>start,int time){
      int l=0,r=start.size()-1;
      while(l<=r){
       int mid=l+(r-l)/2;
       if(start.get(mid)>time){
        r=mid-1;
       }
       else if(start.get(mid)<=time){
        l=mid+1;
       }
      }
      if(l>r)return l-1;
      return l;
    }
}