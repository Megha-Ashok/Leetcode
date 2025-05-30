class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>arr=new ArrayList<>();
        callfun(n,1,1,0,"(",arr);
        return arr;
    }
    public static void callfun(int n,int i,int open,int close,String s,ArrayList<String>arr){
        if(i==2*n){
            arr.add(s);
            return;
        }
         if(open<n)
            callfun(n,i+1,open+1,close,s+'(',arr);
         if(open>close)
            callfun(n,i+1,open,close+1,s+')',arr);
    }
    
}