class Solution {
    public boolean isCycle(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0 ; i<V ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        
        for(int i = 0; i<V ;i++){
            if(!visited[i] && isCycleBfs(adj,i,visited)){
                return true;
            }
        }
        return false;
    }
    
    
    public boolean isCycleBfs(ArrayList<ArrayList<Integer>> adj , int u, boolean[] visited){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(u,-1));
        visited[u] = true;
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            int source = p.node;
            int parent = p.parent;
            for(int v : adj.get(source)){
                if(!visited[v]){
                    visited[v] = true;
                    q.add(new Pair(v,source));
                }
                else if(v != parent){
                    return true;
                }
            }
        }
        return false;
    }
    
}



class Pair{
    int node;
    int parent;
    
    public Pair(int node , int parent){
        this.node = node;
        this.parent = parent;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna