class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashMap<Integer,Integer>hash=new HashMap<>();
        int count=0;
        for(int i=0;i<words.length;i++){
          if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))){
            count++;
          }
          hash.put(i,count);
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
          int left=0;
        if(hash.containsKey(queries[i][0]-1)){
          left=hash.get(queries[i][0]-1);
        }
        res[i]=hash.get(queries[i][1])-left;
        }
        return res;
    }
    public static boolean isVowel(char ch){
      switch(ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':return true;
      }
      return false;
    }
}