class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer>list= new ArrayList<>();
       boolean vis[]=new boolean[V];
       if(!vis[0]){
           dfs(0,adj,list,vis);
       }
       return list;
    }
    
    public void dfs(int v,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>list,boolean vis[]){
        vis[v]=true;
        list.add(v);
        for(Integer neighbour:adj.get(v)){
            if(!vis[neighbour]){
                dfs(neighbour,adj,list,vis);
            }
        }
    }
}