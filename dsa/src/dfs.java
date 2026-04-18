import java.util.*;

public class dfs {
    private int V;
    private LinkedList<Integer>[] adj;

    public dfs(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) adj[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void dfs(int s){
        dfsu(s,new boolean[V]);
    }
    public void dfsu(int start,boolean visited[]){
        visited[start]= true;
        System.out.print(start);
        for(int n:adj[start]){
            if(!visited[n]){
                dfsu(n,visited);
            }
        }
    }
    public void dfsstack(int start){
        boolean[] vis=new boolean[V];
        Stack<Integer> st=new Stack<>();
        st.push(start);
        while(!st.isEmpty()){
            int node=st.pop();
            if(!vis[node]){
                vis[node]=true;
                System.out.print(node+" ");
                for(int nei:adj[node]){
                    if(!vis[nei]){
                        st.push(nei);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        dfs g = new dfs(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.dfsstack(2);
    }
}