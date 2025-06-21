class Solution {
   static int rank[];
    public boolean equationsPossible(String[] equations) {
      int parent[]=new int[26];
      rank=new int[26];
      for(int i=0;i<26;i++){
        parent[i]=i;
        rank[i]=0;
      }
      for(String str:equations){
        if(str.charAt(1)=='='){
            union(str.charAt(0)-'a',str.charAt(3)-'a',parent);
        }
      }
      for(String str:equations){
        if(str.charAt(1)=='!'){
            int first=find(str.charAt(0)-'a',parent);
            int  second=find(str.charAt(3)-'a',parent);
            if(first==second)return false;
        }
      }
      return true;
    }
    public static void union (int parent_1,int parent_2,int parent[]){
        parent_1=find(parent_1,parent);
        parent_2=find(parent_2,parent);
        if(rank[parent_1]<rank[parent_2]){
          parent[parent_1]=parent_2;
        }
        else if(rank[parent_1]>rank[parent_2]){
          parent[parent_2]=parent_1;
        }
        else{
          parent[parent_2]=parent_1;
          rank[parent_1]++;
        }
    }
    public static int find(int ch,int parent[]){
       if(ch==parent[ch]){
        return ch;
       }
       return find(parent[ch],parent);
    }
}