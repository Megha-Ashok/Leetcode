class Solution {
    static HashMap<String,Double>hash;
    public double soupServings(int n) {
     int unit=(int)Math.ceil(n/25.0);
     hash=new HashMap<>();
     if (unit>= 200) return 1;
     return find(unit,unit);
    }
    public static double find(int A,int B){
       if(A<=0 && B<=0)return 0.5;
       if(A<=0)return 1;
       if(B<=0)return 0.0;
       String key=A+","+B;
       if(hash.containsKey(key))return hash.get(key);
       double value=0.25*(find(A-4,B)+find(A-3,B-1)+find(A-2,B-2)+find(A-1,B-3));
       hash.put(key,value);
       return value;
    }
}