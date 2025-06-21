class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
     int visit[]=new int[rooms.size()];
        Queue<Integer>que=new LinkedList<>();
        int count=1;
        visit[0]=1;
        for(int i=0;i<rooms.get(0).size();i++){
            int key=rooms.get(0).get(i);
            que.add(key);
            visit[key]=1;
            count++;
        }
        while(!que.isEmpty()){
            int key=que.remove();
            for(int i=0;i<rooms.get(key).size();i++){
                int key1=rooms.get(key).get(i);
                if(visit[key1]!=1){
                que.add(key1);
                visit[key1]=1;
                count++;
                }
            }
        }
        if(count==rooms.size())return true;
        return false; 
    }
}
/*
visit=new int[rooms.size()];
    count=0;
    callfun(rooms,0);
     if(count==rooms.size())return true;
     return false;

    }
    public static void callfun(List<List<Integer>> rooms,int source){
        visit[source]=1;
        count++;
        for(int i=0;i<rooms.get(source).size();i++){
            int key=rooms.get(source).get(i);
            if(visit[key]!=1){
                callfun(rooms,key);
            }
        }
    }
    */