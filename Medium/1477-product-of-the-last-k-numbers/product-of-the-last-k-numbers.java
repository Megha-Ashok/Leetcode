class ProductOfNumbers {
    ArrayList<Integer>arr;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
    }
    public void add(int num) {
        arr.add(num);
    }
    
    public int getProduct(int k) {
       if(arr.size()<k)return -1;
       int count=0;
       int sum=1;
       int index=arr.size()-1;
       while(count<k && index>=0){
        sum*=arr.get(index);
        index--;
        count++;
       } 
       return sum;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */