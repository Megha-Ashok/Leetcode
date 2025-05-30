class Solution {
    public int[][] generateMatrix(int n) {
        int res[][]=new int[n][n];
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=n-1;
        int count=1;
        int size=n*n;
        while(count<=size){
            for(int i=startCol;i<=endCol && count<=size;i++){
                res[startRow][i]=count;
                count++;
            }
            startRow++;
            for(int i=startRow;i<=endRow && count<=size;i++){
                res[i][endCol]=count;
                count++;
            }
            endCol--;
            for(int j=endCol;j>=startCol && count<=size;j--){
                res[endRow][j]=count;
                count++;
            }
            endRow--;
            for(int i=endRow;i>=startRow && count<=size;i--){
                res[i][startCol]=count;
                count++;
            }
            startCol++;
        }
        return res;
    }
}