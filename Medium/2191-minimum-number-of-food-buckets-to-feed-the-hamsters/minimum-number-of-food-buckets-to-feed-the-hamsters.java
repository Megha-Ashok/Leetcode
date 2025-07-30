class Solution {
    public int minimumBuckets(String hamsters) {
      if(hamsters.indexOf('.')==-1)return -1;
      int n=hamsters.length();
      int count=0;
      HashSet<Integer>hash=new HashSet<>();
      for(int i=0;i<n;i++){
        if(hamsters.charAt(i)=='H'){
          if((i==0 && hamsters.charAt(i+1)=='H') || (i==n-1 && hamsters.charAt(i-1)=='H'))return -1;
          if(i!=0 && i!=n-1 && hamsters.charAt(i+1)=='H' && hamsters.charAt(i-1)=='H')return -1;
        }
        else if(i!=0 && i!=n-1 && hamsters.charAt(i+1)=='H' && hamsters.charAt(i-1)=='H' && !hash.contains(i-1) && !hash.contains(i+1)){
          hash.add(i-1);
          hash.add(i+1);
          count++;
        }
      }
      for(int i=0;i<n;i++){
        if(hamsters.charAt(i)=='H' && !hash.contains(i))count++;
      }
      return count;
    }
}