class Solution {
    public boolean detectCapitalUse(String word) {
       if(word.equals(word.toLowerCase())|| word.equals(word.toUpperCase()))return true;
       if(Character.isUpperCase(word.charAt(0))){
        String temp=word.substring(1,word.length());
        if(temp.equals(temp.toLowerCase()))return true;
       }
       return false; 
    }
}