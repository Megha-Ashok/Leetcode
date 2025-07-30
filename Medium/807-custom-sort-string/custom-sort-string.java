class Solution {
    public String customSortString(String order, String s) {
        StringBuilder p=new StringBuilder();
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch:order.toCharArray()){
            if(s.contains(ch+"")){
                for(int i=0;i<arr[ch-'a'];i++)
                p.append(ch);
            }
        }
        if(p.length()!=s.length()){
            String l=p.toString();
             for(char ch:s.toCharArray()){
                if(!l.contains(ch+"")){
                    p.append(ch);
                }
             }
        }
        return p.toString();
    }
}