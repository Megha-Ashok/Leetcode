class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int indegree[]=new int[numCourses];
        int graph[][]=new int[numCourses][numCourses];
        for(int i=0;i<prerequisites.length;i++){
           indegree[prerequisites[i][0]]++;
           graph[prerequisites[i][1]][prerequisites[i][0]]=1;
        }
        Queue<Integer>que=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }
        if(que.isEmpty())return false;
        int count=0;
        while(!que.isEmpty()){
         int nn=que.remove();
         count++;
         for(int i=0;i<numCourses;i++){
            if(graph[nn][i]==1 && indegree[i]>0){
                indegree[i]--;
                if(indegree[i]==0)que.add(i);
            }
         }
        }
        if(count==numCourses)return true;
        return false;
    }
}