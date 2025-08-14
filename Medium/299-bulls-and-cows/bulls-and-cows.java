class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer>secret1=new HashMap<>();
        HashMap<Character,Integer>guess1=new HashMap<>();
        int bulls=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i))bulls++;
            else{
                if(secret1.containsKey(secret.charAt(i))){
                    secret1.put(secret.charAt(i),secret1.get(secret.charAt(i))+1);
                }
                else{
                    secret1.put(secret.charAt(i),1);
                }
                if(guess1.containsKey(guess.charAt(i))){
                    guess1.put(guess.charAt(i),guess1.get(guess.charAt(i))+1);
                }
                else{
                    guess1.put(guess.charAt(i),1);
                }
            }
        }
        int cow=0;
        for(Map.Entry<Character,Integer>set:secret1.entrySet()){
            if(guess1.containsKey(set.getKey())){
                cow+=Math.min(guess1.get(set.getKey()),set.getValue());
            }
        }
        String res=""+bulls+'A'+cow+'B';
        return res;
    }
}