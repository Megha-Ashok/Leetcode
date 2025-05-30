class Solution {
        static String arr[]={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();
        ArrayList<String>w=new ArrayList<>();
       String p=arr[digits.charAt(0)-'1'];
        ArrayList<String>q=new ArrayList<>();
            for(int i=0;i<p.length();i++){
               q.add(p.charAt(i)+"");
            }
            for(int k=1;k<digits.length();k++){
            p=arr[digits.charAt(k)-'1'];
             w=new ArrayList<>();
            for(int j=0;j<q.size();j++){
                String l=q.get(j);
            for(int i=0;i<p.length();i++){
                w.add(l+p.charAt(i));
            }
            }
            q=new ArrayList<>(w);
            }
            return q;
    }
}