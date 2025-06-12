class MinStack {
    Stack<Integer>stk;
    PriorityQueue<Integer>arr;
    public MinStack() {
        arr=new PriorityQueue<>();
        stk=new Stack<>();
    }
    
    public void push(int val) {
       arr.add(val);
       stk.push(val);
    }
    
    public void pop() {
        int val=stk.pop();
        arr.remove(val);
    }

    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
       return arr.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 /*
  if(!arr.isEmpty()){
        Pair p=arr.peek();
        if(p.min<val)
            arr.push(new Pair(val,p.min));
        else
        arr.push(new Pair(val,val));
        }
        else arr.push(new Pair(val,val));
        */