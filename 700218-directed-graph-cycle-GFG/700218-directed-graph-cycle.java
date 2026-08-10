class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0 ; i<V ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }
        boolean[] visited = new boolean[V];
        boolean[] inRecursion = new boolean[V];
        
        for(int i = 0 ; i<V ; i++){
            if(!visited[i] && isCycleDfs(i,adj,visited,inRecursion)) return true;
        }
        return false;
    }
    
    public boolean isCycleDfs(int u , ArrayList<ArrayList<Integer>> adj , boolean[] visited , boolean[] inRecursion){
        visited[u] = true;
        inRecursion[u] = true;
        
        for(int v : adj.get(u)){
            if(visited[v]==false && isCycleDfs(v,adj,visited,inRecursion)) return true;
            else if(inRecursion[v] == true) return true;
        }
        inRecursion[u] = false;
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna