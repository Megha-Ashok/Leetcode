class Solution {
    //added
    public void setZeroes(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==0)callfun(matrix,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==991659){
                    matrix[i][j]=0;
                }
            }
        }
        
      return;
    }
    public static void callfun(int matrix[][],int row,int col){
         for(int i=0;i<matrix[0].length;i++){
            if(matrix[row][i]==0)continue;
            matrix[row][i]=991659;
        }
        for(int i=0;i<matrix.length;i++){
           if(matrix[i][col]==0)continue;
             matrix[i][col]=991659;
        }
    }
}