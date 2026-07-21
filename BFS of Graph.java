class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            
            for(Integer i : adj.get(node)){
                if(visited[i] == false){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
        
    }
}
