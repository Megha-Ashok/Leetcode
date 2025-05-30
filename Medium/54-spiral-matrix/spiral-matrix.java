class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int row=0,row1=matrix.length-1;
          List<Integer>arr=new ArrayList<>();
          int sum=matrix[0].length*(row1+1);
          int count=0;
          int col=0,col1=matrix[0].length-1;
          while(row<=row1 && col<=col1){
             for(int i=col;i<=col1;i++){
                if(count==sum)break;
                arr.add(matrix[row][i]);
                count++;
             }
             for(int i=row+1;i<=row1;i++){
                if(count==sum)break;
                arr.add(matrix[i][col1]);
                count++;
             }
             for(int i=col1-1;i>=col;i--){
                if(count==sum)break;
                arr.add(matrix[row1][i]);
                count++;
             }
             for(int i=row1-1;i>row;i--){
                if(count==sum)break;
                arr.add(matrix[i][col]);
                count++;
             }
           row++;
           col++;
           col1--;
           row1--;
          }
          return arr;
    }
}