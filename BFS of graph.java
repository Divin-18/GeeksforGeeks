class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>list=new ArrayList<>();
        boolean vis[]=new boolean[V];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            list.add(u);
            for(Integer neighbour:adj.get(u)){
                if(!vis[neighbour]){
                    q.add(neighbour);
                    vis[neighbour]=true;
                }
            }
        }
        return list;
    }
}