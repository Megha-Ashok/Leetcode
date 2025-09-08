class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       Queue<int []>que=new LinkedList<>();
       que.add(new int[]{sr,sc});
       int origin=image[sr][sc];
       int n=image.length;
       int m=image[0].length;
       image[sr][sc]=color;
       if(origin==color)return image;
       while(!que.isEmpty()){
        int size=que.size();
        for(int i=0;i<size;i++){
            int row=que.peek()[0];
            int col=que.peek()[1];
            if(row+1<n && image[row+1][col]==origin){
                image[row+1][col]=color;
                que.add(new int[]{row+1,col});
            }
            if(col+1<m && image[row][col+1]==origin){
                image[row][col+1]=color;
                que.add(new int[]{row,col+1});
            }
            if(row-1>=0 && image[row-1][col]==origin){
                image[row-1][col]=color;
                que.add(new int[]{row-1,col});
            }
            if(col-1>=0 && image[row][col-1]==origin){
                image[row][col-1]=color;
                que.add(new int[]{row,col-1});
            }
             que.remove();
        }
       } 
       return image;
    }
}