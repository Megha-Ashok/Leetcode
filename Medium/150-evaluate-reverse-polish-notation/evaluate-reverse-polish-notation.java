class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>res=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String p=tokens[i];
            if(isOperator(p)){
                int n2=res.pop();
                int n1=res.pop();
                res.push(operation(n1,n2,p));
            }
            else{
                res.push(Integer.parseInt(p));
            }
        }
        return res.pop();
    }
    public static boolean isOperator(String ch){
        switch(ch){
            case "+":
            case "-":
            case "*":
            case "/":return true;
        }
        return false;
    }
    public static int operation(int n1,int n2,String ch){
        switch(ch){
            case "+":return n1+n2;
            case "-":return n1-n2;
            case "*":return n1*n2;
            case "/":return n1/n2;
        }
        return 0;
    } 
}