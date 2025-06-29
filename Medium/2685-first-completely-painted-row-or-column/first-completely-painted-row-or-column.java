class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row[]=new int[mat.length];
        int col[]=new int[mat[0].length];
        HashMap<Integer,int[]>hash=new HashMap<>();
        for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
          hash.put(mat[i][j],new int[]{i,j});
        }
        }
        for(int i=0;i<arr.length;i++){
          int val[]=hash.get(arr[i]);
          row[val[0]]++;
          col[val[1]]++;
          if(col[val[1]]==mat.length)return i;
          if(row[val[0]]==mat[0].length)return i;
        }
        return 0;
    }
}