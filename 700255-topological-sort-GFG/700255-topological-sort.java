class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
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
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i<V ; i++){
            if(!visited[i]){
                DFS(i,adj,visited,stack);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
        
    }
    
    public void DFS(int u , ArrayList<ArrayList<Integer>> adj , boolean[] visited , Stack<Integer> stack){
        visited[u] = true;
        
        for(int v : adj.get(u)){
            if(!visited[v]){
                DFS(v,adj,visited,stack);
            }
        }
        stack.push(u);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna