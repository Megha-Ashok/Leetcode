class Solution {
    public void rotate(int[][] matrix) {
           ArrayList<Integer>arr=new ArrayList<>();
          int row=0,row1=matrix.length-1;
          int col=0,col1=matrix[0].length-1;
          while(row<row1 && col<col1){
             for(int i=col;i<=col1;i++){
                arr.add(matrix[row][i]);
             }
             matrix[row][col1]=arr.remove(0);
             for(int i=row+1;i<=row1;i++){
                arr.add(matrix[i][col1]);
                matrix[i][col1]=arr.remove(0);
             }
             for(int i=col1-1;i>=col;i--){
                arr.add(matrix[row1][i]);
                matrix[row1][i]=arr.remove(0);
             }
             for(int i=row1-1;i>=row;i--){
                arr.add(matrix[i][col]);
                matrix[i][col]=arr.remove(0);
             }
             for(int i=col+1;i<=col1;i++){
                matrix[row][i]=arr.remove(0);
             }
           row++;
           col++;
           col1--;
           row1--;
          }
          return;
        
    }
}