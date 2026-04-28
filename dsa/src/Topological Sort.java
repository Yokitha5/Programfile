// 1.Topological Sort
import java.util.*;
public class Main {

    static class Graph {
        int V;
        ArrayList<ArrayList<Integer>> adj;

        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
        }
      
        void topoUtil(int node, boolean[] visited, Stack<Integer> stack) {
            visited[node] = true;

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    topoUtil(neighbor, visited, stack);
                }
            }

            stack.push(node);
        }
        void topoSort() {
            boolean[] visited = new boolean[V];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < V; i++) {
                if (!visited[i]) {
                    topoUtil(i, visited, stack);
                }
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);

        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        g.topoSort();
    }
}
