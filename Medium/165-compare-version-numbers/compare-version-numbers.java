class Solution {
    public int compareVersion(String version1, String version2) {
        String ch1[]=version1.split("\\.");
        String ch2[]=version2.split("\\.");
        int i=0,j=0;
        while(i<ch1.length && j<ch2.length){
            if(Integer.parseInt(ch1[i])>Integer.parseInt(ch2[j])){
                return 1;
            }
            if(Integer.parseInt(ch1[i])<Integer.parseInt(ch2[j])){
                return -1;
            }    
            i++;
            j++;
        }
        if(i!=ch1.length){
          while(i!=ch1.length){
            if(Integer.parseInt(ch1[i])!=0)
            return 1;
            i++;
          }
        }
        
        if(j!=ch2.length){
          while(j!=ch2.length){
            if(Integer.parseInt(ch2[j])!=0)
             return -1;
            j++;
          }
        }
        return 0;
    }
}