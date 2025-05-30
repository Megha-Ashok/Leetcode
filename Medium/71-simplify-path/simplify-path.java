class Solution {
    public String simplifyPath(String path) {
        String s[]=path.split("/");
        Deque<String>str=new ArrayDeque();
        for(int i=0;i<s.length;i++){
            if(s[i].equals("."))
            continue;
            else if(s[i].equals(".."))
            {
            if(!str.isEmpty())
            str.removeLast();
            else
            continue;
            }
            else if(s[i].equals(""))continue;
            else 
            str.add(s[i]);
        }
        StringBuilder arr=new StringBuilder();
        if(str.isEmpty())arr.append("/");
        while(!str.isEmpty()){
            arr.append("/");
            arr.append(str.remove());
        }
        return arr.toString();

    }
}