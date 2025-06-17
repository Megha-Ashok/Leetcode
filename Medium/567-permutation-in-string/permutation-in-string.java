class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int temp[]=new int[26];
       HashMap<Character,Integer>hash=new HashMap<>();
       for(char ch:s1.toCharArray()){
        if(hash.containsKey(ch)){
          int val=hash.get(ch);
          hash.put(ch,val+1);
        }
        else{
          hash.put(ch,1);
        }
       }
       int n=s1.length();
       int m=s2.length();
       int i=0,j=0;
       while(i+n<=m){
        j=0;
        temp=new int[26];
        while(j<n){
          if(!hash.containsKey(s2.charAt(j+i))|| hash.get(s2.charAt(i+j))<=temp[s2.charAt(j+i)-'a'])break;
          temp[s2.charAt(j+i)-'a']++;
          j++;
        }
        if(j==n)return true;
        i++;
       }
       return false;
    }
}