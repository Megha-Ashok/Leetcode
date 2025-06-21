class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
    ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
    for(int i=0;i<numCourses;i++){
      adj.add(new ArrayList<>());
    }
    for(int i=0;i<prerequisites.length;i++){
      adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
    } 
    List<Boolean>res=new ArrayList<>();
     for(int i=0;i<queries.length;i++){
        if(callfun(queries[i][0],queries[i][1],adj,new int[numCourses]))res.add(true);
        else res.add(false);
     }
     return res;
    }
    public static boolean callfun(int source,int dest,ArrayList<ArrayList<Integer>>adj,int visit[]){
        Queue<Integer>que=new LinkedList<>();
        que.add(source);
        visit[source]=1;
        while(!que.isEmpty()){
          int size=que.size();
          for(int i=0;i<size;i++){
            int nn=que.remove();
            for(int child:adj.get(nn)){
              if(child==dest)return true;
              if(visit[child]!=1){
                visit[child]=1;
                que.add(child);
              }
            }
          }
        }
        return false;
    }
}