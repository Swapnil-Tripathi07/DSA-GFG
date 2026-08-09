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
            if(!visited[i] && isCycleDfs(adj,i,visited,-1)){
                return true;
            }
        }
        return false;
    }
    
    public boolean isCycleDfs(ArrayList<ArrayList<Integer>> adj , int u, boolean[] visited , int parent){
        visited[u] = true;
        for(int v : adj.get(u)){
            if(v==parent) continue;
            if( visited[v]) return true;
            
            if(isCycleDfs(adj,v,visited,u)) return true;
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna