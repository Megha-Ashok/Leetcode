class Solution {
    public String convert(String s, int numRows) {
      if(numRows==1 || s.length()==1)return s;
        ArrayList<ArrayList<Character>>temp=new ArrayList<>();
        for(int i=0;i<numRows;i++){
          temp.add(new ArrayList<>());
        }    
        int i=1;
        int j=0;
        temp.get(0).add(s.charAt(0));
        while(i<s.length()){
          if(j==0){
            j++;
            while(j<numRows && i<s.length()){
              temp.get(j).add(s.charAt(i));
              i++;
              j++;
            }
          }
          else{
            j=numRows-2;
            while(j>=0 && i<s.length()){
            temp.get(j).add(s.charAt(i));
            i++;
            j--;
            }
            j=0;
          }
        }
        StringBuilder res=new StringBuilder();
        for(i=0;i<numRows;i++){
          for(j=0;j<temp.get(i).size();j++){
            res.append(temp.get(i).get(j));
          }
        }
        return res.toString();
    }
}