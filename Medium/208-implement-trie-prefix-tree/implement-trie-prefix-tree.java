class Trie {
    Node root;
    Trie() {
        root=new Node();
    }

    void insert(String word) {
    Node temp=root;
     for(int i=0;i<word.length();i++){
      if(!temp.containsKey(word.charAt(i)))
        temp.put(word.charAt(i),new Node());
        temp=temp.get(word.charAt(i));
     }
     temp.setEnd();
    }

    boolean search(String word) {
        Node temp=root;
        for(int i=0;i<word.length();i++){
            if(!temp.containsKey(word.charAt(i)))return false;
            temp=temp.get(word.charAt(i));
        }
        return temp.isEnd();
    }

    boolean startsWith(String prefix) {
         Node temp=root;
        for(int i=0;i<prefix.length();i++){
            if(!temp.containsKey(prefix.charAt(i)))return false;
            temp=temp.get(prefix.charAt(i));
        }
        return true;
    }
}
class Node{
    Node link[]=new Node [26];
    boolean flag=false;
   public boolean containsKey(char ch){
     if(link[ch-'a']!=null)return true;
     return false;
   }
   public void put(char ch,Node node){
    link[ch-'a']=node;
   }
   public Node get(char ch){
    return link[ch-'a'];
   }
   public void setEnd(){
    flag=true;
   }
   public boolean isEnd(){
    return flag;
   }
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */