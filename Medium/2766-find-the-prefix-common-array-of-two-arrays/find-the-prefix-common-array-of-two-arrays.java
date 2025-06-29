class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int c[]=new int[A.length];
        int count=0;
        ArrayList<Integer>Aelements=new ArrayList<>();
        ArrayList<Integer>Belements=new ArrayList<>();
        for(int i=0;i<A.length;i++){
          Aelements.add(A[i]);
          Belements.add(B[i]);
          if(A[i]==B[i])count++;
          else {
          if(Belements.contains(A[i]))count++;
          if(Aelements.contains(B[i]))count++;
          }
          c[i]=count;
        }
        return c;
    }
}